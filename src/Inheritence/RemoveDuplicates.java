package Inheritence;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int unique = 0;

        for (int scan = 1; scan < nums.length; scan++) {
            if (nums[scan] != nums[unique]) {
                unique++;
                nums[unique] = nums[scan];
            }
        }

        return unique + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        RemoveDuplicates obj = new RemoveDuplicates();

        int k = obj.removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}