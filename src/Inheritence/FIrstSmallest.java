package Inheritence;

import java.util.Arrays;

public class FIrstSmallest
{


    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 1, 7, 4, 7};
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n ; i++) {

            if (arr[i] != arr[i+1]) {
                System.out.println("Smallest Element: " + arr[i]);
                return; // main method ko terminate kar dega
            }
        }

        System.out.println(-1);
    }
}