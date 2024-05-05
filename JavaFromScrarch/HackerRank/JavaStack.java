package HackerRank;
import java.util.*;
public class JavaStack {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String input=sc.next();
            System.out.println(isValid(input));
        }
    }
    static boolean isValid(String str){
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if((ch == '}' && stack.peek()=='{') || (ch == ')' && stack.peek()=='(') || (ch == ']' && stack.peek()=='[')){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
