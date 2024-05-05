package HackerRank;
import java.util.*;
public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of line :: ");
        int n = sc.nextInt();
        while(n >= 0){
            String str = sc.nextLine();
            System.out.println(duplicateWords(str));
            n--;
        }
    }
    static String duplicateWords(String ptr){
        String[] arr = ptr.split(" ");
        Stack<String> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            String s = arr[i];
            if (st.isEmpty()) {
                st.push(s);
            } else if (s.equalsIgnoreCase(st.peek())) {
                continue;
            } else {
                st.push(arr[i]);
            }
        }
        Stack<String> dup = new Stack<>();
        while(!st.isEmpty()){
            dup.push(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!dup.isEmpty()){
            sb.append(dup.pop() + " ");
        }
        int n = sb.length();
        sb.deleteCharAt(n-1);
        return sb.toString();
    }
}
