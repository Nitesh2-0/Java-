package Stack;
import java.util.Stack;
public class PrefixEvaluation {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        int n = s.length();
        Stack<Integer> ans = new Stack<>();
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                ans.push(ascii-48);
            } else {
              int val1 = ans.pop();
              int val2 = ans.pop();
              if(ch=='+') {ans.push(val1+val2);}
              if(ch=='-') {ans.push(val1-val2);}
              if(ch=='/') {ans.push(val1/val2);}
              if(ch=='*') {ans.push(val1*val2);}
            }
        }
        int prefixEvaluation = ans.pop();
        System.out.println("Ans :: " + prefixEvaluation);
    }
}
