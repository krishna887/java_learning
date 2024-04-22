package org.example.core_java;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter any number that you want to check, whether it is prime or not:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int count=0;
        if(number>0){
        for(int i=1; i<=number;i++){
            if(number%i==0)
                count++;
        }
            if(count==2) {
                System.out.println("The given Number is Prime");
            }
            else System.out.println("The given number is not Prime");
        }
        else
        System.out.println("Invalid number number should be grater than 0");
    }
}
