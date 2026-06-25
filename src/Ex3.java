import org.w3c.dom.ls.LSOutput;

public class Ex3
{
    static void movezero(int[] nums) {
        int j = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }

        }

    }

    public static void main (String[] args)
    {
            int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
            movezero(nums);

            for (int i=0; i < nums.length; i++)
            {
                System.out.print(nums[i] + " ");
            }
        }

}
