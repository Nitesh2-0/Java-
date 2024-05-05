package LeetCode;
import java.util.Scanner;
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit = " + maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrices = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrices = Math.min(minPrices,prices[i]);
            profit = Math.max(profit,prices[i]-minPrices);
        }
        return profit;
    }
}
