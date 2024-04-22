package org.example.core_java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year you want to check it is leap or not :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year > 0) {
            if (year % 4 == 0 && year % 100 != 0) {
                var nth = year / 4;

                System.out.println("The entered Year " + year + " is " + nth + " th leap Year");


            } else if (year % 400 == 0) {
                var nth = year / 4;
                System.out.println("The entered Year " + year + " is" + nth + " th leap year");
            } else {
                System.out.println("The entered Year " + year + " is not leap year");
            }
        }
        System.out.println("the year is not 0 and negative");
    }
}
