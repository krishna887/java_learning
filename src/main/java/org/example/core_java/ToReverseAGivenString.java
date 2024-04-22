package org.example.core_java;

import java.util.Scanner;

public class ToReverseAGivenString {
    public static void main(String[] args) {
        System.out.println("Enter any string that you want to reverse:");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb= new StringBuilder(str);
        System.out.println( "The reverse of given string is:" +sb.reverse());
        sc.close();
    }
}
