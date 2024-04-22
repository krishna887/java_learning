package org.example.lambda_stream_api;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenAndOddTerm {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     int sumOfEvenTerm=  list.stream().filter(a-> a%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEvenTerm);
      int sumOfOddTerm=  list.stream().filter(a->a%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfOddTerm);
    }
}
