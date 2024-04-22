package org.example.core_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class VanityPhoneNumber {

    // Mapping of digits to letters as per phone keypad
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    // Method to generate possible words from the dictionary for a given phone number
    public static List<String> generateWords(String phoneNumber, String dictionaryFile) {
        List<String> result = new ArrayList<>();
        List<String> dictionary = loadDictionary(dictionaryFile);

        generateWordsHelper(phoneNumber, "", 0, result, dictionary);

        return result;
    }

    // Helper method for recursive generation of possible words
    private static void generateWordsHelper(String phoneNumber, String currentWord, int index, List<String> result, List<String> dictionary) {
        if (index == phoneNumber.length()) {
            if (dictionary.contains(currentWord)) {
                result.add(currentWord);
            }
            return;
        }

        char digit = phoneNumber.charAt(index);
        String letters = digitToLetters.get(digit);
        if (letters != null) {
            for (char letter : letters.toCharArray()) {
                generateWordsHelper(phoneNumber, currentWord + letter, index + 1, result, dictionary);
            }
        }
    }

    // Method to load dictionary from file
    private static List<String> loadDictionary(String fileName) {
        List<String> dictionary = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.add(line.toLowerCase()); // Convert all words to lowercase for case-insensitive comparison
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionary;
    }

    public static void main(String[] args) {
        String dictionaryFile = "/home/krishna/IdeaProjects/JavaLearnings/src/main/java/org/example/core_java/sample_dictionary.txt"; // Hardcoded filename

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine().replaceAll("[^\\d]", ""); // Remove non-digit characters
        scanner.close();

        List<String> words = generateWords(phoneNumber, dictionaryFile);

        if (words.isEmpty()) {
            System.out.println("No words found for the given phone number.");
        } else {
            System.out.println("Possible words for the given phone number:");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }


}
