package tasks;

import java.util.Scanner;

public class Tasks_type {
    private final Scanner sc = new Scanner(System.in);



    /**
     * this method find the minimum element in the array
     * Time complexity: O(n), where n is the size of the array.
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
     * Time complexity: O(n), where n is the size of the array.
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

    /**
     * this method calculates the factorial of a given number
     *time complexity is O(n) where n is th input number
     *  recursive algorithm iterates through all numbers   from n to 1.
     * @param n the number for which the factorial is to be calculated
     * @return  The factorial of the given number
     */
    public  int factorial(int n) {
        if( n == 0|| n == 1) return 1;

        return n * factorial(n-1);
    }

    /**
     * this method for find n-th elements in Fibonacci sequence using recursion
     *  time complexity is O(2^n) where n is input number
     * @param n the number for which fibonacci is to be calculated
     * @return the fibonacci sequence
     */
    public int fibonacci(int n) {
        if  (n == 0) return 0;
        if  (n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }


    /**
     * this method to computes a^n (a raised to the power of n).
     *
     * Time complexity is O(n) where n is input number
     * @param a the number that will be raised to a power
     * @param n power number
     * @return power of a number
     */
    public int power(int a,int n){
        if  (n == 0) return 1;

        return a * power(a,n-1);
    }


    /**
     * this method recursive to print an array in reverse order without using arrays explicitly.
     *Time complexity is O(n) where n is input number
     * @param n length of array
     * print array in reverse order
     */
    public void reverse(int n) {
        if  (n == 0) return;

        int num = sc.nextInt();
        reverse(n - 1);
        System.out.println(num + " ");
    }

    /**
     * Time compexity is O(n) where nn is the length of the string.
     * Recursively checks if the string consists only of digits.
     * @param str the input string
     * @param start index the current position in the string
     * @return true if the string consists only of digits, false otherwise
     */
    public boolean isDigit(String str, int start) {
        //base case if we checked all characters return true
        if (str.length() == start) {return true;}

        // If the current character is not a digit, return false
        if(!Character.isDigit(str.charAt(start))) {
            return false;
        }

        return isDigit(str, start + 1);
    }

    /**
     * this method is Recursive function to compute the Binomial Coefficient
     * time complexity O(2^n)
     * @param n The total number of elements in the set.
     * @param k The number of elements to choose.
     * @return the binomial coefficient
     */
    public static int binomial(int n, int k) {
        if ( k > n) return 0; // it is invalid case
        if(n == k || k == 0) {return 1;} // here is base case

        int res =  binomial(n - 1,k-1) + binomial(n-1,k) ;

        return res;
    }

    /**
     * this method find the GCD by using Euclidean Algorithm,recursive step: gcd(b, remainder of a/b)
     * Time complexity is  O(log n).
     * @param a number for compute GCD
     * @param b number for compute GCD
     * @return the GCD of two numbers
     */
    public static int gcd(int a, int b) {
        if( b == 0) {
            return a;// base case: If b becomes 0, return a as the GCD
        }

        return gcd(b, a % b);
    }
}
