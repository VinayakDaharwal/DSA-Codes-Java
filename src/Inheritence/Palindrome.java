package Inheritence;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalinSent(String s) {
        // code here
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalinSent(s));
    }
}