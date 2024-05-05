package LeetCode;
import java.util.Scanner;
public class ReverseWordsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :: ");
        String str = sc.nextLine();
        System.out.println("Ans :: " + reverseWords(str));
    }
    static String reverseWords(String s) {
        //TC-O(n) & SC-O(n)
        s = s.trim();
        String[] st = s.split(" ");
        int str = 0 , end = st.length-1;
        while(str <= end){
            swap(st,str,end);
            str++; end--;
        }
        String ans = st[0];
        for(int i=1; i<st.length; i++){
            ans = ans.trim();
            ans += " " + st[i];
        }
        return ans;
    }
    static void swap(String[] arr, int str, int end){
        String temp = arr[str];
        arr[str] = arr[end];
        arr[end] = temp;
    }
    
}
