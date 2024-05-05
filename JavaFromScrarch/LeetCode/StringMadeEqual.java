package LeetCode;
import java.util.Scanner;
public class StringMadeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string-1 :: ");
        String str = sc.next();
        System.out.print("Enter a string-2 :: ");
        String ptr = sc.next();
        System.out.println("Ans = " + canBeEqual(str,ptr));
    }
    public static boolean canBeEqual(String str , String end){
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length-2; i++){
            int j = i+2;
            if(chars[i]==end.charAt(i)) continue;
            else{
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
        String str1 = String.valueOf(chars);
        return str1.equals(end);
    }
}
