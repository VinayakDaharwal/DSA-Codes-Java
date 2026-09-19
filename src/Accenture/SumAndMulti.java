package Accenture;

public class SumAndMulti {
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = A[i] * (i + 1) + sum;
        }

        System.out.println(sum);
    }
}
