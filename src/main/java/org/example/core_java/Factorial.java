package org.example.core_java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter any number for which you want to find a factorial: ");
        Scanner sc= new Scanner(System.in);
       var number= sc.nextInt();
       var fact=1;
       for (int i=1; i<=number; i++){
           fact *=i; //5*4*3*2*1
       }
        System.out.println(fact);
    }
}
