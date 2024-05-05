package HackerRank;
import java.util.HashMap;

public class TwoString {
    public static void main(String[] args) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        String str = "hello";
        String str1 = "wd";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!hm1.containsKey(c)){
               hm1.put(c,c);
            }
        }
        for(int j=0; j<str1.length(); j++){
            char c = str1.charAt(j);
            if(hm1.containsKey(c)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        System.out.println(hm1);

     }
}
