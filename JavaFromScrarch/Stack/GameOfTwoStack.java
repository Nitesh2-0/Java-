package Stack;
import java.util.*;

public class GameOfTwoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.print("Enter the length of first list :: ");
        int n1 = sc.nextInt();
        for(int i=0; i<n1; i++){
            list1.add(sc.nextInt());
        }
        System.out.print("Enter the length of Second list :: ");
        int n2 = sc.nextInt();
        for(int i=0; i<n2; i++){
            list2.add(sc.nextInt());
        }
        System.out.print("What will be maxSum :: ");
        int maxSum = sc.nextInt();
        System.out.print("Count will be : " + twoStacks(maxSum,list1,list2));
    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        Collections.reverse(a);
        Collections.reverse(b);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int CN = 0 ;
        for(Integer i : a){
            stack1.push(i);
        }
        for(Integer j : b){
            stack2.push(j);
        }
        int CSM = 0;
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            int data1 = stack1.peek();
            int data2 = stack2.peek();
            if((CSM+data2+data1) <= maxSum){
                CN += 2;
                CSM += data1+data2;
               stack2.pop();
               stack1.pop();
            } else if ((CSM+data1) <= maxSum){
                CSM += data1;
                CN++;
                stack1.pop();
            } else if((CSM+data2) <= maxSum){
                CSM += data2;
                CN++;
                stack2.pop();
            } else {
                break;
            }
        }
        while(!stack1.isEmpty()){
            int data = stack1.peek();
            if((data+CSM) <= 10){
                CN++;
                CSM += data;
                stack1.pop();
            } else {
                break;
            }
        }
        while(!stack2.isEmpty()){
            int data = stack2.peek();
            if((data+CSM) <= 10){
                CN++;
                CSM += data;
                stack2.pop();
            } else {
                break;
            }
        }
        return CN;
    }
}
