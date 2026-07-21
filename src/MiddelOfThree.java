import java.util.*;

public class MiddelOfThree {
    public static int middleno(int a,int b, int c){

        if ((a < b && b < c) || (c < b && b < a))
            return b;
        else if ((b<a && a<c) || (c<a && a < b))
        return a;

        else
            return c;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(middleno(a,b,c));
        sc.close();
    }

    }


