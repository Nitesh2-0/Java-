package ContestLeetCode.Codechef;
import java.util.Scanner;

public class AntiAdjacentSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        
        //logic
        int i = 0, j = 1, count = 0;
        while(i < n && j < n){
            if((j-i)>1 && arr[i] == arr[j]){
                j++;
            }else if((j-i)>1 && (arr[i] > arr[j])){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                count++;
                //if(count > 2) break;
            }else if((j-i)>1 && (arr[i] < arr[j])){
                j++;
            }else{
                i++;
                j = i+1;
            }
        }
        System.out.println(isSorted(arr));
        for(Integer k : arr){
            System.out.println(k);
        }
    }
    public static boolean isSorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
}
