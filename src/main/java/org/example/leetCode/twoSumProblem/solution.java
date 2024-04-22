package org.example.leetCode.twoSumProblem;

public class solution {
    public static void main(String[] args) {
//        int numbs[]= {2,7,11,15};
//        int target=9;

//        int numbs[]={3,2,4};
//        int target=6;

        int numbs[]={3,3};
        int target=6;
       int[] result= twoSum(numbs,target);
       for(int i=0; i< result.length; i++){
           System.out.println(result[i] );
       }


    }
    private static int[] twoSum(int[] numbs, int target) {
        int n = numbs.length ;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }
}
