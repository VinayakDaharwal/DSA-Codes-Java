public class Main {
    public static void main(String[] args)
    {
        int[] A = {3,3,0,99,-40};
        int max = Integer.MIN_VALUE;

            for (int i=0; i<A.length; i++)
            {
                if (A[i] > max)
                {
                    max = A[i];
                }
            }
        System.out.println(max);

    }
}