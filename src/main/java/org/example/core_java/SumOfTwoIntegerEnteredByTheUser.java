package org.example.core_java;

import java.util.Scanner;

public class SumOfTwoIntegerEnteredByTheUser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
     var a=scanner.nextInt();
        System.out.println("enter the second number");
       var b= scanner.nextInt();
       var result=a+b;
        System.out.println("the sum of two entered number is:" +result);
scanner.close();
    }
}
