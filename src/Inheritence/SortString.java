package Inheritence;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

        public static String sortString(String s) {
            // code here
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(sortString(s));
        }
    }

