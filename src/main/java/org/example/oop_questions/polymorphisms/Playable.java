package org.example.oop_questions.polymorphisms;

public interface Playable {
    void play();
}
class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("playing piyano...");

    }
}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("playing guitar...");

    }
}
class Drum implements Playable{
    @Override
    public void play() {
        System.out.println("playing drum...");

    }
}
