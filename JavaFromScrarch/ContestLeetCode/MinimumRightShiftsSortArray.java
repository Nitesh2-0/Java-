package ContestLeetCode;
import java.util.*;

public class MinimumRightShiftsSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Element :: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> al = new ArrayList<>();
        for (int k : arr){
            al.add(k);
        }
        System.out.println("Ans :: " + minimumRightShifts(al));
        System.out.println("Ans :: " + minimumRightShifts1(al));
    }
    static int minimumRightShifts( List<Integer> all){
        boolean isTrue = isSorted(all);
        if(isTrue) return 0;
        int n = all.size();
        int str = 0 , end = n-1;
        int count=0;
        List<Integer> al = new ArrayList<>();
        while(str <= end){
            if(all.get(str) > all.get(end)){
                al.add(all.get(end));
                count++;
                end--;
            }
            else {
                break;
            }
        }
        Collections.reverse(al);
        for(int i=0; i<=end; i++){
            al.add(all.get(i));
        }
        boolean currCheck = isSorted(al);
        if(currCheck) return count;
        return -1;
    }
    static int minimumRightShifts1(List<Integer> nums) {
        int count=0;
        int idx=-1;
        for(int i=1;i<nums.size();i++)
        {
            if(nums.get(i)<nums.get(i-1)){
                count++;
                idx=i;
            }
        }
        if(count>0 && nums.get(0)<nums.get(nums.size()-1)) return -1;

        if(count>1) return -1;

        if(idx==-1) return 0;
        System.out.println(idx);
        return nums.size()-idx;
    }
    static boolean isSorted(List<Integer> num){
        for(int i=1; i<num.size(); i++){
            if(num.get(i-1)> num.get(i)){
                return false;
            }
        }
        return true;
    }
}
