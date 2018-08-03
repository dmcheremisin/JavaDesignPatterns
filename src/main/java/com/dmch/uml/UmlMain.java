package com.dmch.uml;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class UmlMain {
    public static void main(String[] args) throws ParseException {
        Employee sysEngineer = new Employee("John", "Smith", "Software engineer");

        IdCard card = new IdCard(123);
        card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
        sysEngineer.setIdCard(card);
        System.out.println(sysEngineer.getName() +" works as: "+ sysEngineer.getPosition());
        System.out.println("Expires: " + new SimpleDateFormat("dd.MM.YYYY").format(sysEngineer.getIdCard().getDateExpire()) );

        sysEngineer.addRoom(new Room(101));
        sysEngineer.addRoom(new Room(321));
        System.out.println("Works in rooms:");
        Iterator iter = sysEngineer.getRooms().iterator();
        while(iter.hasNext()){
            System.out.println( ((Room) iter.next()).getNumber());
        }

        Department programmers = new Department("Programmers");
        programmers.addEmployee(sysEngineer);
        System.out.println("Belongs to the department: "+sysEngineer.getDepartment().getName());

        Department juniorDevelopers = new Department("Junior developers");
        sysEngineer.addPastPosition("Junior Software Developer", juniorDevelopers);
        sysEngineer.getPastPositions().forEach(p -> System.out.println("Pastposition: " + p));

        Employee dana = new Employee("Dana", "White", "CEO");
        Menu.showEmployees(sysEngineer, dana);

        System.out.println("In programmers dep. works: " + programmers.getPersonCount() + " developer(s)");
    }
}
