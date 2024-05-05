package LeetCode;
import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println(compressString(arr));
    }
    public static int compressString(char[] arr){
        String st = String.valueOf(arr);
        int count = 1;
        String ans = "" + st.charAt(0);
        for(int i=1; i<arr.length; i++){
            char prev = st.charAt(i-1);
            char curr = st.charAt(i);
            if(prev == curr){
                count++;
            }
            else{
                if(count > 1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        if(count > 1) ans += count;
        System.out.println(ans);
        return 0;
    }
}
