package InfosysGFG;

public class LinearSearch {

    // Linear Search Method
    public int linearSearch(int[] A, int n, int key) {

        for (int i = 0; i < n; i++) {
            if (A[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // Check whether all elements from start to end are present
    public boolean checkElement(int start, int end, int[] arr) {

        for (int i = start; i <= end; i++) {
            int index = linearSearch(arr, arr.length, i);

            if (index == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        LinearSearch instance = new LinearSearch();

        int[] nums = {1, 4, 5, 2, 7, 8, 3};

        boolean result = instance.checkElement(2, 5, nums);

        System.out.println(result);
    }
}