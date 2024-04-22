package org.example.core_java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you want to check armstrong or not:");
        Scanner scanner= new Scanner(System.in);
        int numb=scanner.nextInt();
        int number=numb;
        int newNumber=0;
        //123=1^3+2^3+3^3
        while(number>0)
        {
           int digit= number%10;
           newNumber=newNumber+digit*digit*digit;
           number/=10;
        }

        if(numb==newNumber){
            System.out.println("The entered Number is armstrong");
        }
        else System.out.println("The given number is not armstrong");
    }
}
