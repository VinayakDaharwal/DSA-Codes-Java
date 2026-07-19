package Inheritence;

import java.util.Scanner;

public class IdenticalMatrix {
        public static boolean identicalMat(int[][] mat1, int[][] mat2) {
            // code here

            int n = mat1.length;
            for (int i =0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(mat1[i][j] != mat2[i][j]);
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix 1 row and columns:");
        int n=sc.nextInt();
        int m= sc.nextInt();
        System.out.println("Enter first matrix elements:");
        int [][] mat1= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter matrix 2 row and columns:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int [][] mat2= new int [a][b];
        System.out.println("Enter second matrix elements:");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Are matrix identical?");
        System.out.println(identicalMat(mat1,mat2));
    }
}
