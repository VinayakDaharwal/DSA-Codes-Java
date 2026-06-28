package Inheritence;

import java.util.HashSet;

public class ContainsDuplicates {

    public boolean containsduplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates obj = new ContainsDuplicates();

        int[] nums = {1, 2, 3, 1};

        System.out.println(obj.containsduplicates(nums));
    }
}
