package Stack.PracticeQuestion;
import java.util.Stack;
public class RemoveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] result =removeConsecutiveSubsequence(arr);
        for(int k : result){
            System.out.print(k + " ");
        }
    }
    static int[] removeConsecutiveSubsequence(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(stack.isEmpty() || stack.peek() != arr[i]) stack.push(arr[i]);
            else if(stack.peek() == arr[i]){
               if(i == n-1 || arr[i] == arr[i+1]) stack.pop();
            }
        }
        int[] result = new int[stack.size()];
        int m = result.length;
        for(int j=m-1; j>=0; j--){
            result[j] = stack.pop();
        }
        return result;
    }
}
