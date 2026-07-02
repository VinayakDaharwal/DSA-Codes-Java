package Inheritence;

public class MeanOfArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate mean
        double mean = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);
    }
}