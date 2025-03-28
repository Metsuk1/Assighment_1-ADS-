import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter the length of array
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int task_1 = findMinimum(arr);
        System.out.println(task_1);


    }


    /**
     * this method find the minimum element in the array
     * @param arr accept array of integer
     * @return the minimum in the given array
     */
    public static int findMinimum(int[] arr) {
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
