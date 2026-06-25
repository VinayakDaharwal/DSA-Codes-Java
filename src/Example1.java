public class Example1
{
    int linearSearch(int[] nums, int target)
    {
        int index = -1;

        for (int i=0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                index = i;
                break;

            }
        }
        return index;

    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,3};
        int key = 3;

        Example1 instance = new Example1();
        int index =  instance.linearSearch(arr,key);

        if (index >= 0)
        {
            System.out.println(key + "--- found at " + index);
        }
        else {
            System.out.println(key + "--- Not ---");
        }
    }
}
