public class Ex1
{
    public static void main(String[] args)
    {
        int[] A = {8,8,7,6,5};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0; i< A.length; i++)
        {
            if ( A[i] > firstMax)
            {
                secondMax = firstMax;

                firstMax = A[i];

            } else if (A[i] > secondMax)
            {
                secondMax = A[i];

            }
        }
        System.out.println(secondMax);


        }
    }