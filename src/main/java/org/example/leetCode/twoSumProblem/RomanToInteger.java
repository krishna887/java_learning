package org.example.leetCode.twoSumProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Enter a valid roman Character:");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String s=str.toUpperCase();
        System.out.println("The integer of "+ s+ " is:" +romanToInteger(s));
//        romanToInteger(s);

    }

    private static int romanToInteger(String s) {
        Map<Character,Integer> m= new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int ans=0;
        for(int i=0; i<s.length();i++){
            if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1))){
                ans-=m.get(s.charAt(i));
            }
            else
                ans+= m.get(s.charAt(i));

        }

return  ans;

    }
}
