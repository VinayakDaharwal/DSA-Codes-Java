package Inheritence;

public class KRotations  {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length;

        // Rotate array k times
        for (int j = 0; j < k; j++) {

            // Store last element
            int temp = arr[n - 1];

            // Shift elements to the right
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            // Put last element at first position
            arr[0] = temp;
        }

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}