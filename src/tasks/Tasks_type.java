package tasks;

import java.util.Scanner;

public class Tasks_type {
    private final Scanner sc = new Scanner(System.in);






    /**
     * this method find the minimum element in the array
     * @param arr accept array of integer
     * @return the minimum in the given array
     */
    public int findMinimum(int[] arr) {

        // initialize our minimum
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        // return minimum element
        return min;
    }
}
