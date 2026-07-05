package Inheritence;

import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicates: ");

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            } else {
                set.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 9, 1, 7};

        findDuplicates(arr);
    }
}