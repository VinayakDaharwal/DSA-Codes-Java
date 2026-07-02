package Inheritence;

public class DuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // If array is empty
        if (nums.length == 0) {
            return 0;
        }

        int unique = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int length = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + length);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}