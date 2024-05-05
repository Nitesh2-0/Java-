package DString.Problems;
import java.util.HashMap;

public class MaximumCharacter {
    public static void main(String[] args) {
        String str = "testsamplett";
        StringBuilder sb = new StringBuilder(str);
        int max = Integer.MIN_VALUE,count = 0;
        for(int i=0; i<str.length(); i++){
           for(int k=i+1; k<str.length(); k++){
               char ch1 = str.charAt(i);
               char ch2 = str.charAt(k);
               if(ch1 == ch2){
                  count++;
               }
           }
           max = Math.max(max,count);
           count = 0;
        }
        System.out.println(max);
    }
}
