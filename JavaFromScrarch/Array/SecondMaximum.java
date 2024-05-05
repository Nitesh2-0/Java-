package Array;
public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(secondMaximum(arr));
    }
    public static int secondMaximum(int[] arr){
        int maxValIdx = maxValueIdx(arr);
        arr[maxValIdx] = Integer.MIN_VALUE;
        int secondMaxVal = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            secondMaxVal = Math.max(secondMaxVal,arr[i]);
        }
        return secondMaxVal;
    }
    public static int maxValueIdx(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] == max) return i;
        }
        return -1;
    }
}
