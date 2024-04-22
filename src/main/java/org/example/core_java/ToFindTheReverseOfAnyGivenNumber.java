package org.example.core_java;

import java.util.Scanner;

public class ToFindTheReverseOfAnyGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number for which you want to find the reverse:");
        Scanner scanner=new Scanner(System.in);
        var num=scanner.nextInt();
        int reverse=0;
        while(num>0){

           int i= num%10;
            reverse= reverse*10+i;
            num=num/10;

        }
        System.out.println("The reverse of given Number is: "+reverse);


    }


}
