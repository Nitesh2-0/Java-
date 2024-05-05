package HackerRank;
import java.util.Scanner;
public class AppendDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String :: ");
        String str = sc.next();
        System.out.print("Enter the second String :: ");
        String ptr = sc.next();
        System.out.print("Enter the number of operation :: ");
        int k = sc.nextInt();
        System.out.println("Ans :: " + appendAndDelete(str,ptr,k));
        System.out.println("Ans :: " + appendDelete(str,ptr,k));
    }
   public static String appendAndDelete(String s, String t, int k) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(k >=(s.length()+t.length())) return "Yes";
        int i=0;
        for(i=0; i<Math.min(s.length(),t.length()); i++){
            if(s.charAt(i) != t.charAt(i)){
               break;
            }
        }
        //Basic maths
        int excess = s.length() - i;
        int addingElem = t.length()-i;
        int sum = excess + addingElem;
        int curr = k-sum;
        if(curr >=0 && curr%2==0){
            return "Yes";
        }
        return "No";
    }
    static String appendDelete(String s, String t, int k){
        int mini = Math.min(s.length(),t.length());
        if(k >= (s.length()+t.length())) return "Yes";
        for(int i=0; i<Math.min(s.length(),t.length()); i++){
            if(s.charAt(i) != t.charAt(i)){
                mini = i;
                break;
            }
        }
        k -= (s.length() - mini);
        k -= (t.length() - mini);
        return (k >= 0 && k%2 == 0)? "Yes" : "No";
    }
}
