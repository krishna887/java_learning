package org.example.core_java;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter any number you want to find the factorial: ");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int factorial= findFactorial(number);
        System.out.println("the factorial of given number is :" +factorial);
    }

    private static int findFactorial(int num) {
        if(num==0|| num==1){
            return 1;
        }
        else return num*findFactorial(num-1);
    }
}
