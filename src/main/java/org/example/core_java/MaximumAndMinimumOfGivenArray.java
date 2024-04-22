package org.example.core_java;

import java.util.Scanner;

public class MaximumAndMinimumOfGivenArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of array element:");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];


        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter the " + (i + 1) + "th element of array:");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min= array[0];
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i]<min){
                min=array[i];
            }

        }
        System.out.println("maximum element in the given array is:" + max);
        System.out.println("minimum element in the given array is:" + min);
    }
}
