package HackerRank;
import java.util.Stack;
public class SuperReducingString {
    public static void main(String[] args) {
        Stack<Character> ch = new Stack<>();
        String st = "aaabccddd";
        int n = st.length();
        for(int i=0; i<n; i++){
            char c = st.charAt(i);
            if(ch.isEmpty()){
                ch.push(c);
            }
            else if(ch.peek()==c){
                ch.pop();
            }
            else{
                ch.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!ch.isEmpty()){
            sb.append(ch.pop());
        }
        sb.reverse();
        String st1 = sb.toString();
        System.out.println(st1);
    }
}
