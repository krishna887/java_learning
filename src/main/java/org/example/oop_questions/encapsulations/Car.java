package org.example.oop_questions.encapsulations;

import java.util.Date;
//questions number 1
public class Car {
    private String model;
    private Date date;
    private String make;
    public void makingCar(){
        System.out.println("we are making a car");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


}
