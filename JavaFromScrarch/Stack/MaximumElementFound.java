package Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElementFound {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the list :: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            list.add(str);
        }
        System.out.println("Max Element will be like ,");
        System.out.println(getMax(list));
    }
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> maxContainer = new ArrayList<>();
        Stack<Integer> maxStack = new Stack<>();
        for (String op : operations) {
            String[] arr = op.split(" ");
            int type = Integer.parseInt(arr[0]);

            switch (type) {
                case 1: {
                    int value = Integer.parseInt(arr[1]);
                    stack.push(value);

                    if (maxStack.isEmpty() || value >= maxStack.peek()) {
                        maxStack.push(value);
                    }
                    break;
                }
                case 2: {
                    if (!stack.isEmpty()) {
                        int poppedValue = stack.pop();
                        if (poppedValue == maxStack.peek()) {
                            maxStack.pop();
                        }
                    }
                    break;
                }
                case 3: {
                    maxContainer.add(maxStack.isEmpty() ? 0 : maxStack.peek());
                    break;
                }
            }
        }
        return maxContainer;
    }
}
