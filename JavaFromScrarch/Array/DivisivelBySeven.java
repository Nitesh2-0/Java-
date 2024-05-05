package Array;
public class DivisivelBySeven {
    public static void main(String[] args) {

        int[] arr = {14,8,2,4,7};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(remove(arr,sum));
    }
    static int remove(int[] arr, int sum){
        int smallest = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            int curr = sum  - arr[i];
            int val = arr[i];
            if(curr%7==0){
                if(smallest > val){
                    smallest = val;
                    idx = i;
                }
            }
        }
        return idx;
    }
}
