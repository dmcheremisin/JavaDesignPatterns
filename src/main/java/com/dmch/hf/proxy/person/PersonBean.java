package com.dmch.hf.proxy.person;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name) throws IllegalAccessException;
    void setGender(String gender) throws IllegalAccessException;
    void setInterests(String interests) throws IllegalAccessException;
    void setHotOrNotRating(int rating) throws IllegalAccessException;
}
