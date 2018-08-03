package com.dmch.uml;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee extends Man {
    private String position;
    private IdCard idCard;
    private Set<Room> rooms = new HashSet<>();
    private Department department;
    private Set<PastPosition> pastPositions = new HashSet<>();

    public Employee(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public IdCard getIdCard() {
        return idCard;
    }
    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void deleteRoom(Room room){
        rooms.remove(room);
    }
    public Set<Room> getRooms() {
        return rooms;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Set<String> getPastPositions() {
        return pastPositions.stream().map(PastPosition::getName).collect(Collectors.toSet());
    }
    public void addPastPosition(String name, Department department) {
        pastPositions.add(new PastPosition(name, department));
    }

    private class PastPosition {
        private String name;
        private Department department;

        public PastPosition(String name, Department department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Department getDepartment() {
            return department;
        }
        public void setDepartment(Department department) {
            this.department = department;
        }
    }

}
