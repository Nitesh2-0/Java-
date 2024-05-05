package Stack.PracticeQuestion;
import java.util.*;
public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :: ");
        String str = sc.nextLine();
        System.out.println("Ans :: " + isValid(str));
    }
    static boolean isValid(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
                if((c=='}' && top != '{')) return false;
            }
        }
        return st.isEmpty();
    }
}
