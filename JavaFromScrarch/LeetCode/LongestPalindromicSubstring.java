package LeetCode;
import java.util.Scanner;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = sc.next();
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        //Approach takes time O(n^3)
        String result = "";
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sbStr = s.substring(i,j);
                int currLength = sbStr.length();
                boolean isPalindrome = isPalindrome(sbStr);
                if((isPalindrome) && currLength > prev){
                    result = sbStr;
                    prev = currLength;
                }
            }
        }
        return result;
    }
    static boolean isPalindrome(String name){
        int str = 0, end = name.length()-1;
        while(str < end){
            if(name.charAt(str) != name.charAt(end)){
                return false;
            }
            str++; end--;
        }
        return true;
    }
}
