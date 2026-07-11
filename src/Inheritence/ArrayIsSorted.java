package Inheritence;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayIsSorted {
    public static boolean isSorted(int[] arr) {
        // code here
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
    }
}

