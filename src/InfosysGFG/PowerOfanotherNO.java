package InfosysGFG;

import java.util.Scanner;

public class PowerOfanotherNO {
    public static boolean isPower(int x,int y){
        if (x == 1)
            return (y == 1);
        long pow = 1;
        while (pow < y)
            pow = pow * x;
        return (pow == y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println(isPower(x,y));
        sc.close();
    }
}
