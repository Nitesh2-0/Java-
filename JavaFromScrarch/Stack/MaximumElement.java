package Stack;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        System.out.print("Enter the length of the list :: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            l.add(s);
        }
        System.out.println("Max :: " + getMax(l));
    }

    public static List<Integer> getMax1(List<String> operations) {
        // TLE -> Time Limit Exceeded -> 16/27 Testcases Executed
        Stack<Integer> performQuery = new Stack<>();
        ArrayList<Integer> store = new ArrayList<>();
        for (String op : operations){
            String[] arr = op.split(" ");
            int type = Integer.parseInt(arr[0]);
            switch(type){
                case 1:
                    int value = Integer.parseInt(arr[1]);
                    performQuery.add(value);
                    break;
                case 2:
                    performQuery.pop();
                    break;
                case 3:
                    int maxValue = printMax(performQuery);
                    store.add(maxValue);
                    break;
            }
        }
        return store;
    }
    public static int printMax(Stack<Integer> st){
        int maximum = Integer.MIN_VALUE;
        Stack<Integer> duplicate = new Stack<>();
        while(!st.isEmpty()){
            int currElm = st.pop();
            duplicate.add(currElm);
            maximum = Math.max(maximum,currElm);
        }
        while (!duplicate.isEmpty()){
            st.push(duplicate.pop());
        }
        return maximum;
    }

    public static List<Integer> getMax (List<String> operations){
        Stack<Integer> operation = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Stack<Integer> maxMaintainer = new Stack<>();
        for(String t : operations){
            String[] support = t.split(" ");
            int type = Integer.parseInt(support[0]);
            switch (type){
                case 1 :
                    int x = Integer.parseInt(support[1]);
                    operation.push(x);
                    if(maxMaintainer.isEmpty() || x >= maxMaintainer.peek() ){
                        maxMaintainer.push(x);
                    }
                    break;
                case 2 :
                    while(!operation.isEmpty()){
                        int currValue = operation.pop();
                        if(currValue == maxMaintainer.peek()){
                            maxMaintainer.pop();
                        }
                    }
                    break;
                case 3 :
                    list.add(maxMaintainer.isEmpty()? 0:maxMaintainer.peek());
                    break;
            }
        }
        return list;
    }
}
