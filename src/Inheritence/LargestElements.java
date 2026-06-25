package Inheritence;

import org.w3c.dom.ls.LSOutput;

public class LargestElements {
    public static void main(String [] args){
        int[] arr = {1,3,4,5,2,7,8};
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println(max);
    }

}
