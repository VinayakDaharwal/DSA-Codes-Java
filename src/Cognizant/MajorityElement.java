package Cognizant;

public class MajorityElement {
    public static int MajorElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > arr.length/2){
                return arr[i];
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,5,1,1,2,1};
        System.out.println(MajorElements(arr));
    }
}
