package Array;
public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,7,6,70};
        int[] hold = smallestAndLargest(arr);
        System.out.println(hold[0] + " " + hold[1]);
    }
    public static int[] smallestAndLargest(int[]arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        int[] array = {min,max};
        return array;
    }
}
