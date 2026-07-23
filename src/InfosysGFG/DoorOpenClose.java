package InfosysGFG;

import java.util.ArrayList;
import java.util.Scanner;

public class DoorOpenClose {
    public static ArrayList<Integer> checkDoor(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            int root = (int) Math.sqrt(i);
            if (root * root == i)
            ans.add(1);
            else
                ans.add(0);

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println(checkDoor(n));
    }
}
