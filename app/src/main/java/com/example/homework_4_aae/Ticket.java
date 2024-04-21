package com.example.homework_4_aae;

import java.io.Serializable;

public class Ticket implements Serializable {
    // поля
    private int ID;
    private int Place;
    private String Time;
    private String Time1;
    private int Price;

    public Ticket(int ID, int place, String time, String time1, int price) {
        this.ID = ID;
        this.Place = place;
        this.Time = time;
        this.Time1 = time1;
        this.Price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        this.Place = place;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public String getTime1() {
        return Time1;
    }

    public void setTime1(String time1) {
        this.Time1 = time1;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
}
