package Cognizant;

public class HCLRemoveDuplicate2 {

    //Remove duplicates from arr and give the original length
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 2, 3, 6, 3};
            int count = 0;
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                boolean duplicates = false;

                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        duplicates = true;
                        break;
                    }
                }
                if (!duplicates) {
                    arr[count] = arr[i];
                    count++;
                }
            }
            System.out.println("Length after removing duplicates: " + count);

        }
    }
