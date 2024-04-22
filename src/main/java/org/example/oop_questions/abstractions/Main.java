package org.example.oop_questions.abstractions;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        Rect rectangle= new Rect(5,6);
        System.out.println(circle.calculateArea());
        System.out.println(  rectangle.calculateArea());
    }
}
