package Array;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0};
        int target = 3;
        System.out.println(tripletsSum(arr,target));
    }
    public static int tripletsSum(int[] arr, int target){
        int tripletsCount = 0;
        for(int i=0; i< arr.length-2; i++){
            for (int k=i+1; k< arr.length-1; k++){
                for (int j=k+1; j<arr.length; j++){
                    if(arr[i]+arr[j]+arr[k] == target) tripletsCount++;
                }
            }
        }
        return tripletsCount;
    }
}
