package LeetCode;
import java.util.Scanner;
public class ReverseStringII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = sc.next();
        System.out.println(reverseStr(str,2));
    }
    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        String str = s.substring(0,k);
        sb.append(str);
        sb.reverse();
        String str1 = s.substring(k,s.length());
        return sb+str1;
    }
}
