package org.example.leetCode.twoSumProblem;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindLongestPrefix {
    public static void main(String[] args) {
        String[] abc= {"flower", "floor","flue"};
        System.out.println(longestCommonPerfix(abc));


    }

    private static String longestCommonPerfix(String[] str) {
        StringBuilder ans= new StringBuilder();
        Arrays.sort(str);
        String first= str[0];
        String last= str[str.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
