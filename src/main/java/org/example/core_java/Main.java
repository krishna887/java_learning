package org.example.core_java;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Main
{

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (i % 2 == 0) {
                    sum += numbers.get(i);
                } else {
                    sum -= numbers.get(i);
                }
            }

            System.out.println("The sum of alternating elements is: " + sum);
        }
    }



//Questions appears in the f1 soft 

    // 1) which of the following is not oop of java
    // 2)what is the full form of oop
    // 3)what throw do
    // 4)what is caught and unscratched exception
    // 5)which of the following is true foe interface
    // 6)which method can be used without making object of a class
    // 7)What this keyword use
    // 8)super keyword use
    //9)why constructor is used
    //10)what is dependency injection
    //11)design pattern bata 3 ta
    //14)code harko output bata 2 ta --> euta bigriyo
    //16)which is not the primitive data type of java
    //17)which is not the identifier---> yo pani bigriyo
    //18)static keyboard use
    //19)String and String Buffer
    //20)thread creation
    //21)garbage collection ko duita
    //23)== and .equals() ko difference
    //24)which is not the access specifier in java

    //Omg I can remember 24 qn //// among 30 qns thanks god





