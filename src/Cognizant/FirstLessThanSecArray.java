package Cognizant;

import java.util.Arrays;

public class FirstLessThanSecArray {

    public static int[] countArray(int[] a, int[] b){
        int[]  result = new int[a.length];
        for (int i = 0; i<a.length; i++) {
            int count = 0;
            for (int j = 0;  j<b.length; j++){
                if (b[j] <= a[i]){
                    count++;
                }
            }
            result [i] = count;
        }
     return result;
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,1,4,5};
        int[] b = {2,1,3,1,6,2};
        int []result = countArray(a,b);
        System.out.println(Arrays.toString(result));
    }
}
