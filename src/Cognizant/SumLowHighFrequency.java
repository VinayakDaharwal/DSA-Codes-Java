package Cognizant;

import java.util.Scanner;

public class SumLowHighFrequency {

        public int sumHighestAndLowestFrequency(int[] nums) {

            int max = 0;
            int min = nums.length;

            for (int i = 0; i < nums.length; i++) {

                int count = 0;

                for (int j= 0; j < nums.length; j++) {

                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                }

                if (count < min) {
                    min = count;
                }
            }

            return max + min;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Array input
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        SumLowHighFrequency obj = new SumLowHighFrequency();

        int result = obj.sumHighestAndLowestFrequency(nums);

        System.out.println(result);
    }

    }
