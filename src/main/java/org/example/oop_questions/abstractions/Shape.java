package org.example.oop_questions.abstractions;

public abstract class Shape {
     abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

    class Rect extends Shape{
        private  double length;
        private  double wieth;

        public Rect(double length, double wieth) {
            this.length = length;
            this.wieth = wieth;
        }

        @Override
        double calculateArea() {
            return length*wieth;
        }
    }

