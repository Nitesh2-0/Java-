package LeetCode;
import java.util.Scanner;
public class LengthLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :: ");
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        int n = str.length;
        return str[n-1].length();
    }
}
