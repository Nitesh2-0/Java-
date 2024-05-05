package DString;
import java.util.Scanner;
public class PalindromeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            for (int j= i+1; j<=s.length(); j++){
                if(isPalindrome(s.substring(i,j))==true){
                    System.out.print(s.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nNumber of palindrome is " + count + ".");
    }
    public static boolean isPalindrome(String s){
        int str = 0,end = s.length()-1;
        while (str <= end){
            if(s.charAt(str) != s.charAt(end)) return false;
            str++;
            end--;
        }
        return true;
    }
}
