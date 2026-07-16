package Inheritence;

import java.util.Arrays;

public class AdditionOfMatrix {


        public static void addMat(int[][] a, int[][] b) {

            int n = a.length;
            int m = a[0].length;
            int[][] c = new int[n][m];

            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    a[i][j] = a[i][j] + b[i][j];
                }
            }

        }

    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6}};
        int [][] b={{7,7,2},{0,0,1}};
        addMat(a,b);
        System.out.println(Arrays.deepToString(a));
    }
    }

