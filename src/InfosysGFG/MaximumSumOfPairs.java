package InfosysGFG;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfPairs {
    public static int pairsSum(int [] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for (int i = 0; i <a.length; i++){
            sum = sum + a[i] * b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
         for (int i = 0; i<n; i++) {
             a[i] = sc.nextInt();
         }

         for (int i = 0; i<n; i++){
             b[i] = sc.nextInt();
         }
        System.out.println("MaximumSumOfPairs" + pairsSum(a,b));

        sc.close();
    }
}
