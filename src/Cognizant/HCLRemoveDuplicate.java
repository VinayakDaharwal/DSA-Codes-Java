package Cognizant;
import java.util.* ;
public class HCLRemoveDuplicate {
    public  static int rmDuplicate(int [] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<set.size();i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of array after removing duplicates:");
        int result = rmDuplicate(arr);
        System.out.println(result);
    }
}



