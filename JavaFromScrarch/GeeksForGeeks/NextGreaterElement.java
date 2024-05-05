package GeeksForGeeks;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Element in array.");
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long holderWorstResult[] = resultInGivenTime(arr,n);
        for (long l : holderWorstResult) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
    public static long[] resultInWorstCase(long arr[], int n){
        // TC - O(N*N) and SC - O(N)
        long[] num = new long[n];
        int k = 0;
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    num[k++] = arr[j];
                    flag = false;
                    break;
                }
            }
            if(flag){
                num[k++] = -1;
            }
        }
        return num;
    }
    public static long[] resultInGivenTime(long[] arr, int n){
        // TC - O(n) and SC - O(n)
        Stack<Long> st = new Stack<>();
        long[] number = new long[n];
        int k = 0;
        long nullPoint = -1;
        st.push(nullPoint);
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                number[k++] = arr[i+1];
                long top = st.pop();
                if(top < arr[i+1]) {
                    st.push(arr[i+1]);
                }else{
                    st.push(top);
                }
            }else if(arr[i]>arr[i+1] && st.peek()<arr[i]){
                st.push(nullPoint);
            }else if(arr[i]>arr[i+1] && st.peek()>arr[i]){
                st.push(st.peek());
            }else{
                while (!st.isEmpty()){
                    long check = st.pop();
                    if(check > arr[i]){

                    }
                }
            }
        }
        return arr;
    }
}
