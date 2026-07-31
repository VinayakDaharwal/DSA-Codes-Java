package InfosysGFG;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int num) {
        int x = num;
        int mod;
        int res = 0;

        while (x != 0) {
            mod = x % 10;
            res = res * 10 + mod;
            x = x / 10;
        }

        if (res == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}