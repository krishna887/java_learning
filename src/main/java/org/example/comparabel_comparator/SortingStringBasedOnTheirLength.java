package org.example.comparabel_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStringBasedOnTheirLength {
    public static void main(String[] args) {
        Comparator<String> com= new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.length()>t1.length())
                    return 1;
                else return -1;
            }
        };
        List<String> colors= Arrays.asList("violet", "a","indigo","blue","green","yellow","red");
       colors.sort(com);
        System.out.println(colors);
    }
}
