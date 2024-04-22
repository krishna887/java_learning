package org.example.leetCode.twoSumProblem;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println("Enter the first binary number: \n");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println("Enter the second binary number: \n");
        String b= sc.nextLine();


        System.out.println("the sum is:\n"+ addTwoBinary(a,b));

    }
    private static String addTwoBinary(String a, String b) {
        int carry=0;
        StringBuilder sb= new StringBuilder();
        int i= a.length()-1;
        int j= b.length()-1;
        while (i>=0|| j>=0){
           int sum=carry;
           if(i>=0){
               sum+=a.charAt(i--)-'0';
           }
           if(j>=0){
               sum+=b.charAt(j--)-'0';
           }

           carry= sum>1? 1:0;
            sb.append(sum%2);
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
