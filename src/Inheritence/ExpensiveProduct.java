package Inheritence;
import java.util.*;
public class ExpensiveProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product A Price: ");
        int A = sc.nextInt();
        System.out.print("Enter Product B Price: ");
        int B = sc.nextInt();
        if (A>B) {
            System.out.println("Expensive Produt : A ");

        } else if (B>A) {
            System.out.println("Expensive Produt : B ");

        }
        else {
            System.out.println("Invalid");

        }
        sc.close();


    }
}
