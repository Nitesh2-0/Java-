package LeetCode;
import java.util.Arrays;
import java.util.Scanner;
public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] ratting = new int[n];
        for(int i=0; i<n; i++){
            ratting[i] = sc.nextInt();
        }
        System.out.print("Ans :: " +candy(ratting));
    }
    static public int candy(int[] ratings){
        int n = ratings.length;
        int[] result = new int[n];
        Arrays.fill(result,1);
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                result[i]=result[i-1]+1;
            }
        }
        for(int i = n-2;i>=0; i--){
            if (ratings[i]> ratings[i+1])
                result[i]=Math.max(result[i+1]+1, result[i]);
        }
        int candy = 0;
        for(int Candy : result){
            candy += Candy;
        }
        return candy;
    }
}
