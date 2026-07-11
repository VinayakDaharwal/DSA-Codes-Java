package Inheritence;
import java.util.*;
public class StockSellBuy {
        public static int maxProfit(int[] prices) {
            // Code here
            int max =0;
            for( int i=0; i<prices.length-1; i++)
            {
                int buy = prices[i];
                for(int j=i+1; j<prices.length; j++)
                {
                    int sell = prices[j];
                    max = Math.max(max, sell-buy);
                }
            }
            return max;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(maxProfit(arr));

        }
    }


