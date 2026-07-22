package Inheritence;

import java.util.Scanner;

public class BinaryRepresentation {
        static String getBinaryRep(int n) {

            String binary = Integer.toBinaryString(n);

            while (binary.length() < 32) {
                binary = "0" + binary;
            }

            return binary;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getBinaryRep(n));
        sc.close();
    }
}

