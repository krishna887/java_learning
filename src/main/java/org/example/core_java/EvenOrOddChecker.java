package org.example.core_java;

import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        System.out.println("enter the any number do you want to check");
        Scanner scanner=new Scanner(System.in);
       var a= scanner.nextInt();
       if(a%2==0){
           System.out.println("the given number "+ a + " is even number");
       }
       else System.out.println("the given number " + a + " is odd number");
    }
}
