package Inheritence;

import java.util.HashSet;

public class DuplicatesFromUnsortedaArray {
    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 2, 7, 4, 8, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}