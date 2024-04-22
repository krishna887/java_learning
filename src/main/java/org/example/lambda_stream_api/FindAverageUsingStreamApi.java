package org.example.lambda_stream_api;

import java.util.Arrays;
import java.util.List;

public class FindAverageUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

       double average= list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(average);
    }
}
