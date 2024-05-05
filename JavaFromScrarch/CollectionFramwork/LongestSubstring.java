package CollectionFramwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                list.add(s.substring(i,j));
            }
        }
        int length = 0;
        for(String k : list){
            char[] c = k.toCharArray();
            Arrays.sort(c);
            boolean flag = false;
            for(int i=0; i<c.length-1; i++){
                if(c[i] == c[i+1]){
                    flag = true;
                }
            }
            if(!flag){
                length = Math.max(length,k.length());
            }
        }
        return length;
    }
}
