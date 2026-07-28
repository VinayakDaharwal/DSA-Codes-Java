package InfosysGFG;

import java.util.Scanner;

public class CommonDivisor {
    public static int CDivisor(int a,int b){
        int min;
        if (a<b)
            min = a;
        else
            min = b;
        int cnt = 0;
        for (int i = 1; i <=min; i++){
            if (a % i == 0 && b % i == 0)
                cnt++;
        }
        return cnt;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Common Divisor is " + CDivisor(a,b));
        sc.close();
    }
}
