package Inheritence;

import java.util.*;

import java.util.Scanner;
import java.util.Stack;

public class PostfixPushPop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // Number of tokens
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;

                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        System.out.println(stack.pop());
        sc.close();
    }
}