package InfosysGFG;

import java.util.Scanner;

public class PerfectSum {


        // Function to check if the number is perfect
        public static boolean isPerfect(int n) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum == n;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println( isPerfect(n) ? "true" : "false");
        }
    }
