package Array;
public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {-18,5,-38,7,8,8};
        System.out.println(secondMinimumValue(arr));
    }
    public static int secondMinimumValue(int[] arr){
        int smallestElemIdx = SmallestElemIdx(arr);
        arr[smallestElemIdx] = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            minSecond = Math.min(minSecond,arr[i]);
        }
        return minSecond;
    }
    public static int SmallestElemIdx(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] == min) return i;
        }
        return -1;
    }
}
