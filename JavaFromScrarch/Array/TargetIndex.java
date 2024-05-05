package Array;
import java.util.ArrayList;
public class TargetIndex {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        // TC - O(n) SC- O(n)
        int target = 8;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
