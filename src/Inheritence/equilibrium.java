package Inheritence;

import java.util.ArrayList;

class equilibrium {
    static ArrayList<Integer> findEquilibrium(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Check for indexes one by one until
        // an equilibrium index is found
        for (int i = 0; i < arr.length; ++i) {
            // Get left sum
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            // Get right sum
            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];

            // Check the condition
            if (leftSum == rightSum)
                arrayList.add(i);
//                return i;
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }
}