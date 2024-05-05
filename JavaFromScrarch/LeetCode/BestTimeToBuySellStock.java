package LeetCode;
import java.util.Scanner;
public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println("Ans = " + maximumProfit(prices));
    }
    public static int maximumProfit(int[]prices){
        int totalProfit = 0;
        for(int i=1; i< prices.length; i++){
            if(prices[i-1] < prices[i]){
                totalProfit += (prices[i]-prices[i-1]);
            }
        }
        return totalProfit;
    }
}
