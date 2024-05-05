package LeetCode;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        System.out.println("Ans = " +longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] str) {
        String commonPrefix = str[0];
        for(int i=1; i<str.length; i++){
            commonPrefix = commonPrefixChecking(commonPrefix,str[i]);
        }
        return commonPrefix;
    }
    public static String commonPrefixChecking(String str1 , String str2){
        String result = "";
        int n1 = str1.length();
        int n2 = str2.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(str1.charAt(i) != str2.charAt(j)) break;
            result += str1.charAt(i);
            i++; j++;
        }
        return result;
    }
}
