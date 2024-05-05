package Stack;
import java.util.Stack;
import java.util.Scanner;
public class InsertAtBottoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("How many element present into the stack :: ");
        int n = sc.nextInt();
        System.out.print("Enter element :: ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("Before Stack :: " + st);
        System.out.println();
        Stack<Integer> copy = new Stack<>();
        while(st.size() > 0){
            copy.push(st.pop());
        }

        System.out.print("Enter that element , you want to insert at bottom :: ");
        int bottomElem = sc.nextInt();
        st.push(bottomElem);
        while(copy.size() > 0){
            st.push(copy.pop());
        }
        System.out.println("Now Stack :: " + st);
    }
}
