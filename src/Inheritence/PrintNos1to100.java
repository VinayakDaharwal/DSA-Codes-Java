package Inheritence;
import java.util.*;
public class PrintNos1to100 {


        // Prints numbers from 1 to n
        static void printNos(int n) {
            if (n > 0) {
                printNos(n - 1);
                System.out.print(n + " ");
            }
        }

        // Driver Code
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            printNos(n);

            sc.close();
        }
    }
