package Array;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
       reverse(arr);
    }
    public static void reverse(int[] arr){
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
