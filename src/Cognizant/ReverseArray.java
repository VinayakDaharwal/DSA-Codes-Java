package Cognizant;

import java.util.Scanner;

public class ReverseArray {

    public static void RevArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:" );
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        RevArray(arr);
        System.out.println("Reversed array:");
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
