package org.example.lambda_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerOrUpperCaseUsingStreamApi {
    public static void main(String[] args) {
        List<String> colors= Arrays.asList("violet","indigo","blue","green","yellow","red");
        System.out.println(colors);
      var upperCaseColors=  colors.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseColors);
        var lowerCaseColor= colors.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseColor);
    }
}
