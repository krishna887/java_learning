package org.example.oop_questions.polymorphisms;

public class Main {
    public static void main(String[] args) {
        Playable[] instruments= {new Piano(), new Guitar(), new Drum()};
        for(Playable ins:instruments){
            ins.play();
        }
    }
}
