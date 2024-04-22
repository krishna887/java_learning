package org.example.core_java;

import java.util.Scanner;

public class FibonacciUptoGivenTerm {
    public static void main(String[] args) {
        System.out.println("Enter the number up to which you want to print the fibonacci series:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //0 1 1 2 3 5 8
        int a = 0;
        int b = 1;
        while (a<number){
            System.out.println(a+" ");
            int nextTerm=a+b;
            a=b;
            b=nextTerm;
        }


    }
}
