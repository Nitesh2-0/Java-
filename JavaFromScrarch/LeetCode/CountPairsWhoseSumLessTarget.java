package LeetCode;
import java.util.*;

public class CountPairsWhoseSumLessTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        System.out.print("Enter the " + n + " Element :: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value :: ");
        int target = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for(int k : arr){
            li.add(k);
        }
        System.out.println("Ans :: " + countPairs(li,target));
    }
    public static int countPairs(List<Integer> num, int target) {
        // O(n*n) <- TC
        int count = 0 ;
        for(int i=0; i<num.size(); i++){
            for(int j=i+1; j<num.size(); j++){
                if((num.get(i)+num.get(j)) < target){
                    count++;
                }
            }
        }
        return count;
    }
}
