import tasks.Tasks_type;

import java.util.Scanner;

public class MyApplication {
    private final Scanner scanner = new Scanner(System.in);
    private final  Tasks_type task;

    public MyApplication(Tasks_type tasksType) {
        this.task = tasksType;
    }


    public void mainMenu(){
        while (true){
            System.out.println("\n");
            System.out.println("\n****************");
            System.out.println("Please choose one of the following tasks:");
            System.out.println("1.Find minimum in the array");
            System.out.println("2.Find average in the array");
            System.out.println("3.Check number IsPrime");
            System.out.println("4.Find factorial of number");
            System.out.println("5.Find Fibonacci sequence");
            System.out.println("6.Raising a number to a power");
            System.out.println("7.Reverse the array");
            System.out.println("8.Checking whether string is all consists of digits");
            System.out.println("9.Find binomial coefficient");
            System.out.println("10.Find GCD (Euclidean Algorithm)");
            System.out.println("0.Exit");

            System.out.println("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option){
                case 1: findMin();
            }


        }
    }


    private void findMin(){
        System.out.println("Enter the length of the array: ");
        // enter the length of array
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int task_1 = task.findMinimum(arr);
        System.out.println("The minimum element in the array is  " + task_1);

    }




}
