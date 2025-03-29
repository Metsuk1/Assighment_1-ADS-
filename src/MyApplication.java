import tasks.Tasks_type;

import java.util.Scanner;

public class MyApplication {
    private final Scanner sc = new Scanner(System.in);
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
            System.out.println("2.Compute average in the array");
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
            int option = sc.nextInt();

            switch (option){
                case 1 -> findMin();
                case 2 -> findAverage();
                case 3 -> checkNumber();
                case 4 -> Factorial();
                case 5 -> fibonacciSequence();
                case 6 -> power();
                case 7 -> reverseArray();
                case 8 -> isDigit();
                case 9 -> binomialCoefficient();
                case 10 -> findGCD();
                case 0 -> {
                    System.out.println("Goodbye Bro!");
                    return;
                }

                default -> System.out.println("\nInvalid choice");
            }



        }
    }


    private void findMin(){
        System.out.println("Enter the length of the array: ");
        // enter the length of array
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();

        int task_1 = task.findMinimum(arr);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println("The minimum element in the array is  " + task_1);
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void findAverage(){
        // enter the length of array
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();

        double task_2 = task.average(arr);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println("The average is " + task_2);
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void checkNumber(){
        System.out.println("enter a number");
        int n = sc.nextInt();


        double startTime = System.nanoTime();

        String res = task.isPrime(n) ? "Prime" : "Composite";

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println(res + " number");
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void Factorial(){
        // enter the number for calculating factorial
        System.out.println("enter the number for calculating factorial");
        int n = sc.nextInt();

        double startTime = System.nanoTime();

        //hold result
        int result = task.factorial(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println("factorial of  " + n   + "  is  " + result);
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void fibonacciSequence(){

        System.out.println("enter the number for find Fibonacci number");
        int n = sc.nextInt();

        double startTime = System.nanoTime();

        //hold result
        int result = task.fibonacci(n);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds
        System.out.println("the result is " + result);
        System.out.println("the duration is " + duration + " milliseconds");


    }

    private void power(){
        System.out.println("enter the number: ");
        int a = sc.nextInt();

        System.out.println("enter the power: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();

        //hold result
        int result = task.power(a,n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds
        System.out.println("The result is: " + result);
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void reverseArray(){
        System.out.println("enter the number of length of array");
        int n = sc.nextInt();


        double startTime = System.nanoTime();

        //hold result
        task.reverse(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds
        System.out.println("the duration is " + duration + " milliseconds");
    }

    private void isDigit(){
        System.out.println("Enter the string =");
        sc.nextLine();
        String str = sc.nextLine(); // reading the entire input string

        double startTime = System.nanoTime();

        //hold result
        boolean result  = task.isDigit(str,0);
        String res = (result ? "yes" : "no");
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds
        System.out.println(res);
        System.out.println("the duration is " + duration + " milliseconds");
    }

    private void binomialCoefficient(){
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter k");
        int k = sc.nextInt();

        double startTime = System.nanoTime();

        int res = task.binomial(n, k);


        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds
        System.out.println("result is " + res);
        System.out.println("the duration is " + duration + " milliseconds");

    }

    private void findGCD(){
        System.out.println("enter a number");
        int a = sc.nextInt();

        System.out.println("enter b number");
        int b = sc.nextInt();

        double startTime = System.nanoTime();

// Compute gcd using Euclid's algorithm
        int res = task.gcd(a, b);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println("result is " + res);
        System.out.println("the duration is " + duration + " milliseconds");

    }


}
