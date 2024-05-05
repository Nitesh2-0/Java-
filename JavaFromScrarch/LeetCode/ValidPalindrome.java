package LeetCode;
import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            int ascii = (int) (currChar);
            if(ascii >= 65 && ascii <=90){
                ans += currChar;
            }
            else if(ascii >= 97 && ascii <=122){
                ans += currChar;
            }
            else{
                continue;
            }
        }
        ans = ans.toLowerCase();
        System.out.println(ans);
        return checkPalindrome(ans);
    }
    public static boolean checkPalindrome(String s){
        int str = 0 , end = s.length()-1;
        while (str <= end){
            if(s.charAt(str) != s.charAt(end)) return false;
            str++; end--;
        }
        return true;
    }
}
