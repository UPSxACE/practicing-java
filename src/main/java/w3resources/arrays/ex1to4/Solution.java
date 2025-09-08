package w3resources.arrays.ex1to4;

import java.util.Arrays;

public class Solution {
    /**
     * Sorts element in the given array.
     */
    public static void sortArray(int[] array){
        Arrays.sort(array);
    }

    /**
     * Sorts element in the given array.
     */
    public static void sortArray(String[] array){
        Arrays.sort(array);
    }

    /**
     * Sums all values from the given array.
     */
    public static int sumAllValuesInArray(int[] array){
        return Arrays.stream(array).sum();
    }

    /**
     * Returns a string with a 10x10 grid.
     */
    public static String print10x10GridOfDashes(){
        var temp = new StringBuilder();
        for(var i = 0; i < 10; i++){
            if(i != 0) temp.append("\n");
            temp.append("-");
            temp.append(" -".repeat(9));
        }
        return temp.toString();
    }

    /**
     * Calculates the average of the elements inside the given array of numbers.
     */
    public static double calculateAverageArrayElements(int[] numbers){
        return Arrays.stream(numbers).average().orElse(0);
    }
}
