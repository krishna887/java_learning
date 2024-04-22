package org.example.oop_questions.inheritance;

public class Animal {
    private final String name;
    private final String sound;
 public Animal(String name, String sound){
     this.name=name;
     this.sound=sound;
 }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name,"Ghuk_ghuk_ghuk");
    }
    public void makeSound(){

        System.out.println(getName()+ "sounds"+ getSound());
    }

}
class  Cat extends Animal{
    public Cat(String name) {
        super(name, "Meow");
    }

    public void makeSound(){
        System.out.println(getName()+"sounds"+getSound());

    }


}
class Cow extends Animal{
    public Cow(String name) {
        super(name, "baa-baa-baa");
    }

    public void makeSound(){
        System.out.println(getName()+"sounds"+getSound());

    }

}
