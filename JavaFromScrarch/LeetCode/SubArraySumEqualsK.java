package LeetCode;
import java.util.Scanner;
public class SubArraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter thr target :: ");
        int target = sc.nextInt();
        System.out.println("Ans :: " + subArraySum(arr,target));
        System.out.println("Ans  :: " + subArraySum1(arr,target));
    }
    public static int subArraySum(int[] num, int target) {
        //BruitForce Approach - O(n^3)
        int sum = 0,n=num.length, count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    sum += num[k];
                }
                if(sum == target){
                    count++;
                }
                sum = 0;
            }
        }
        return count;
    }
    static int subArraySum1(int[] arr, int target){
        //BruitForce Approach - O(n^2)
        int sum = 0 , count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum==target){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}
