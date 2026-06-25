package Inheritence;

import java.util.Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 1, 7, 4, 7};
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] != arr[n - 1]) {
                System.out.println("Second Largest: " + arr[i]);
                return; // main method ko terminate kar dega
            }
        }

        System.out.println(-1);
    }
}