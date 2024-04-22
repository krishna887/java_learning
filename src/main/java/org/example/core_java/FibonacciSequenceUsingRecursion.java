package org.example.core_java;

import java.util.Scanner;

public class FibonacciSequenceUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you want to find the fibonacci series:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
for(int i=0; i<number; i++){
    System.out.println( fibonacci(i)+" ");
    }
    }

    private static int fibonacci(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fibonacci(number-1)+fibonacci(number-2);


    }
}
