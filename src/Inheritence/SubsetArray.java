package Inheritence;

class SubsetArray {

    public static boolean isSubset(int[] a, int[] b) {

        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            for (int j = 0; j < a.length; j++) {

                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        System.out.println(isSubset(a, b));
    }
}