package org.example.oop_questions.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kalo Biralo " );
        Dog dog = new Dog("khairo Kutta ");
        Cow cow = new Cow("kaili Gai ");
        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
