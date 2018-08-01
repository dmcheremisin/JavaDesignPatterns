package com.dmch.uml;

import java.util.HashSet;
import java.util.Set;

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
    public Set<PastPosition> getPastPositions() {
        return pastPositions;
    }
    public void addPastPosition(PastPosition pastPosition) {
        pastPositions.add(pastPosition);
    }
    public void deletePastPosition(PastPosition pastPosition){
        pastPositions.remove(pastPosition);
    }
}
