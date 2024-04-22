package org.example.core_java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumNumberOfNote {



        public static void main(String[] args) {
            int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1 };// this is array of possible notes
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the amount to return back:");
            int amount= sc.nextInt();
            Map<Integer, Integer> noteCounts = getMinimumNotes(notes, amount);//map lagako key value lai where key is notes and value is kati ota note
            System.out.println("Minimum number of notes required:");
            for (int note : notes) {
                int count = noteCounts.getOrDefault(note, 0);


                if (count > 0) {
                    System.out.println(note + ": " + count);
                }
            }
        }

        public static Map<Integer, Integer> getMinimumNotes(int[] notes, int amount) {
            Map<Integer, Integer> noteCounts = new HashMap<>();
            for (int note : notes) {
                if (amount <= 0) {
                    break;
                }
                int count = amount / note;
                if (count > 0) {
                    noteCounts.put(note, count);
                    amount = amount- count * note;
                }
            }
            return noteCounts;
        }
    }

