package com.dmch.hf.proxy;

import com.dmch.hf.proxy.person.PersonBean;
import com.dmch.hf.proxy.person.PersonBeanImp;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception{
        PersonBean person = new PersonBeanImp("John", "male", "java, scala, groovy");
        PersonBean ownerProxy = getOwnerProxy(person);
        System.out.println("Name: " + ownerProxy.getName());
        ownerProxy.setInterests("html, css, less, sass");
        System.out.println("Interests: " + ownerProxy.getInterests());
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (IllegalAccessException e) {
            System.out.println("Can't change own rating");
        }
        System.out.println("Rating is : " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(person);
        try {
            nonOwnerProxy.setName("Jack");
        } catch (IllegalAccessException e) {
            System.out.println("Non owner can't change other's name");
        }
        System.out.println("Name: " + nonOwnerProxy.getName());
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating is: " + nonOwnerProxy.getHotOrNotRating());

//        Name: John
//        Interests: html, css, less, sass
//        Can't change own rating
//        Rating is : 0
//        Non owner can't change other's name
//        Name: John
//        Rating is: 10
    }

    public static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    public static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
