package org.example.lambda_stream_api;

public class Main {
    public static void main(String[] args) {
        SumOfTwoNumbersUsingLambda sum = ((a, b) -> a + b);
        System.out.println( sum.sumCalculator(5, 6));

    }
}
