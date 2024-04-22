package org.example.core_java.nchl;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers that you want to swap:");
        Scanner sc= new Scanner(System.in);
      int firstNumber=  sc.nextInt();//5
      int secondNumber=sc.nextInt();//6

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber=firstNumber-secondNumber;

        System.out.println("the swapped numbers ara:\n"+firstNumber +"\n" +secondNumber);
    }
}
