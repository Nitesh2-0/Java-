package LeetCode;
import java.util.Scanner;
public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the particular String :: ");
        String str = sc.next();
        System.out.print("Enter "+ str.length() + " Element :: " );
        int[] indices = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            indices[i] = sc.nextInt();
        }
        System.out.println("Ans :: " + restoreString(str,indices));
    }
    public static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] charArray = new char[n];
        String ans = "";
        for(int i=0; i<n; i++){
            int idx = indices[i];
            charArray[idx] = s.charAt(i);
        }
        return String.valueOf(charArray);
    }
}
