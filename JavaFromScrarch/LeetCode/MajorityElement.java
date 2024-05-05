package LeetCode;
import java.util.Arrays;
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("Ans = " + majorityElement(arr));
        System.out.println("Ans = " + majorityElement1(arr,n));
    }
    static int majorityElement(int[] arr){
        //Disadvantages is, it will not work for negative Element
        int[] newArr = new int[5*10000];
        for(int i=0; i<arr.length; i++){
            newArr[arr[i]]++;
        }
        int n = arr.length;
        for(int j=0; j<newArr.length; j++){
            if(newArr[j] > Math.floor(n/2)) return j;
        }
        return -1;
    }
    static int majorityElement1(int[]arr, int n){
        //AdvanceApproach - O(n) Time complexity and O(1) Space Complexity
        int count = 0,candidateHolder = 0;
        for(int num : arr){
            if(count == 0){ candidateHolder = num;}
            if(num == candidateHolder) {count++;}
            else {count--;}
        }
        return candidateHolder;
    }
}
