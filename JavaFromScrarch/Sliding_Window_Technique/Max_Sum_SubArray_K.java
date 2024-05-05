package Sliding_Window_Technique;
public class Max_Sum_SubArray_K {
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k = 2;

        int i=0, j=0, sum=0;
        long max = Long.MIN_VALUE;
        while(j < arr.length){
            sum += arr[j];
            if(j-i+1 == k){
                max = Math.max(max,sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
