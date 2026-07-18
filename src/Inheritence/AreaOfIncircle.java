package Inheritence;

import java.util.Scanner;

public class AreaOfIncircle {

        public static double incircleArea(int P, int B, int H) {
            double r = (P + B - H) / 2.0;
            return (22.0 / 7.0) * r * r;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int P = sc.nextInt();
            int B = sc.nextInt();
            int H = sc.nextInt();

            System.out.printf("%.9f", incircleArea(P, B, H));
        }
    }

