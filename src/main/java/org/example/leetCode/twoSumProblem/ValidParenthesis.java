package org.example.leetCode.twoSumProblem;

import java.util.Scanner;
import java.util.Stack;


public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println("Enter any parenthesis sets:");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( validPatenthesis(s));
    }

    private static boolean validPatenthesis(String s) {
        Stack<Character> stack= new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
           else if(c=='['){
                stack.push(']');
            }
           else if(stack.pop()!=c){
               return false;
            }
        }
        return stack.isEmpty();
    }
}
