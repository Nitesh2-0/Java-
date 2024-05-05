package GeeksForGeeks;
import java.util.Arrays;
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] prise = {100,80,60,70,60,75,85};
        revArray(prise);
        int[] res = calculateSpan(prise, prise.length);
        revArray(res);
        for(int k : res){
            System.out.print(k + " ");
        }
    }
    static int[] calculateSpan(int[] price, int n) {
        //Basic Approach :: TC-O(N^2) & SC-O(N)
        int[] res = new int[n];
        Arrays.fill(res,1);
        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(price[i] > price[j]){
                    count++;
                }
            }
            res[i] = count;
            count = 1;
        }
        return res;
    }
    static void revArray(int[] arr){
        int str = 0 ,end = arr.length-1;
        while (str <= end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++; end--;
        }
    }
}
