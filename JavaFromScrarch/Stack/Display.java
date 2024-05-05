package Stack;
import java.util.Stack;
public class Display {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(9);
        st.push(1);
        st.push(0);
        st.push(5);

        displayRev(st);
        System.out.println();
        display(st);

//        Stack<Integer> sc = new Stack<>();
//        while (st.size() > 0){
//            sc.push(st.pop());
//        }
//
//        System.out.print("Stack :: [" );
//        while (sc.size() > 0){
//            int elem = sc.pop();
//            System.out.print(elem + ", ");
//            st.push(elem);
//        }
//        System.out.print("]" );
//
//        System.out.println();
//        System.out.println("Stack :: " + st);
//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i=n-1; i>=0; i--){
//            arr[i] = st.pop();
//        }
//        for(int j=0; j<n; j++){
//            System.out.print(arr[j] + " ");
//            st.push(arr[j]);
//        }
//        System.out.println();
//        System.out.println( st);
    }
    static void displayRev(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        System.out.print(x + " ");
        displayRev(st);
        st.push(x);
    }
    static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        display(st);
        System.out.print(x + " ");
        st.push(x);
    }
}
