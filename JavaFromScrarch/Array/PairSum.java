package Array;
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,88,5,5,5,22,22,11,11,2};
        int target = 27;
        System.out.println(pairSum(arr,target));
    }
    public static int pairSum(int[] arr, int target){
        int ans = 0;
        for(int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++) {
                if(arr[i]+arr[j] == target) ans++;
            }
        }
        return ans;
    }
}
