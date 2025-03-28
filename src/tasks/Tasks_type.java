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

    /**
     * this method compute average in the array
     * @param arr accept array of integer
     * @return  average  of the array
     */
    public double average(int [] arr) {
        int sum = 0;

        // first of all we sum each element of the array
        for(int num : arr) {
            sum += num;
        }

        // after that we divide the sum of the elements by the length of the array
        return (double)sum / (double)arr.length;
    }

    /**
     *this method checks if a number isPrime or Composite
     * Time complexity: O(n) where n is the input number
     * @param n The number for check to Prime
     * @return isPrime or Composite number
     */
    public  boolean isPrime(int n) {
        if( n < 2) {return false;} // 0 and 1 aren't prime numbers
        if (n == 2 || n == 3) {return true;} //  2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) {return false;}//eliminate even numbers and  multiples of 3

        //Only check odd numbers from 5 to sqrt (n) and skip even numbers.
        for(int i = 5; i * i < n ; i+=6) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        // if number isPrime then return true
        return true;
    }

}
