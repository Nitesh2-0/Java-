package Array.TwoPointerApproach;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        display(arr);
        reverse(arr);
        display(arr);
    }
    public static void  reverse(int[] arr){
        int str = 0 , end = arr.length-1;
        while(str <= end){
            swap(arr,str,end);
            str++; end--;
        }
    }
    public static void swap(int[] arr , int str, int end){
        int temp = arr[str];
        arr[str] = arr[end];
        arr[end] = temp;
    }
    public static void display(int[]arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
