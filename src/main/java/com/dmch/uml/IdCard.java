package com.dmch.uml;

import java.util.Date;

public class IdCard {
    private Date dateExpire;
    private int number;

    public IdCard(int number) {
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }
    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
