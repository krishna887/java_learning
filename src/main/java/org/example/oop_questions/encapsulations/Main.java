package org.example.oop_questions.encapsulations;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.makingCar();
        car.setMake("Making car");
        System.out.println(  car.getMake());
        car.setDate(new Date());
        System.out.println(car.getDate());
        car.setModel("LandCrusior");
        System.out.println( car.getMake());
    }

}
