package DString;
import java.util.Arrays;
public class Exist {
    public static void main(String[] args) {
        String s1 = "Sumit";
        String s2 = "Mitsu";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr= s1.toCharArray();
        Arrays.sort(arr);
        char[] arr1= s1.toCharArray();
        Arrays.sort(arr1);
        String sd = String.valueOf(arr);
        String sd1 = String.valueOf(arr1);
        String s = "";
        if(sd.equals(sd1)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
