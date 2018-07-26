package com.dmch.uml;

public class Menu {
    public static void showEmployees(Employee... employees){
        System.out.println("Workers in the organization: ");
        for (Employee e : employees) {
            System.out.println(e.getName() + " " + e.getSurname() + ", position: " + e.getPosition());
        }

    }
}
