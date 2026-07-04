package Inheritence;

import java.util.HashMap;

public class RemoveDuplicatesFromUnsorted {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 9, 4, 1, 7, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store unique elements in the map
        for (int num : arr) {
            map.put(num, 1);
        }

        // Print unique elements
        System.out.println("Array after removing duplicates:");
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}