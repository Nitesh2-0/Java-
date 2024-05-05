package Stack;
import java.util.Scanner;
import java.util.Stack;
public class InsertAtAnyPosition {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter size of stack :: ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter element :: ");
        for(int i=0; i<=n-1; i++){
            int elem = sc.nextInt();
            st.push(elem);
        }
        System.out.println("Previous Stack :: " + st);
        System.out.print("Enter the Position and Element :: ");
        int pos = sc.nextInt(),elem = sc.nextInt();

        System.out.println("Final Stack :: " + insertingAt(st,pos,elem));
    }
    static Stack<Integer> insertingAt(Stack<Integer> stack,int position, int elem){
        Stack<Integer> copyElem = new Stack<>();
        if(!stack.isEmpty()){
            while(stack.size() > position){
            copyElem.push(stack.pop());
           }
            stack.push(elem);
            while (copyElem.size() > 0){
                stack.push(copyElem.pop());
            }
        }
        else if(stack.isEmpty() && position == 0){
            stack.push(elem);
        }
        else{
            System.out.print("I'm not able to track your index.");
        }
        return stack;
    }
}
