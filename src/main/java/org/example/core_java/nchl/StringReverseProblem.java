package org.example.core_java.nchl;

import java.util.Scanner;

public class StringReverseProblem {
    public static void main(String[] args) {
        System.out.println("Enter any string you want to reverse:");
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        char[] charArray=string.toCharArray();
         reverseCharacterArray(charArray);
        String reverseCharArray= new String(charArray);
        System.out.println("The reverse String is :\n"+reverseCharArray);

    }
    private static void reverseCharacterArray(char[] charArray){
       int start=0;
       int end= charArray.length-1;
       while(start<end){
           char temp=charArray[start];
           charArray[start]=charArray[end];
           charArray[end]=temp;
           start++;
           end--;
       }
    }


}
