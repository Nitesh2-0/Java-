package Stack;
import java.util.*;
public class EqualStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first stack ::: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the length of the second stack ::: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the length of the third stack ::: ");
        int n3 = sc.nextInt();
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        for(int i=0; i<n1; i++){
            int value = sc.nextInt();
            h1.add(value);
        }
        for(int i=0; i<n2; i++){
            int value = sc.nextInt();
            h2.add(value);
        }
        for(int i=0; i<n3; i++){
            int value = sc.nextInt();
            h3.add(value);
        }
        System.out.println("Answer :: " + equalStacks(h1,h2,h3));
    }
   public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
       Collections.sort(h1);
       Collections.sort(h2);
       Collections.sort(h3);
       Stack<Integer> stack1 = new Stack<>();
       Stack<Integer> stack2 = new Stack<>();
       Stack<Integer> stack3 = new Stack<>();
        int sum1 = 0 ;
        int sum2 = 0 ;
        int sum3 = 0 ;
        for(Integer l : h1){
            stack1.add(l);
            sum1 += l;
        }
        for(Integer k : h2){
            stack2.add(k);
            sum2 += k;
        }
        for(Integer m : h3){
            stack3.add(m);
            sum3 += m;
        }
        int finalSum = 0;
        while (stack1.size()>0 && stack2.size()>0 && stack3.size()>0){
            sum1 = sum1-stack1.pop();
            sum2 = sum2-stack2.pop();
            sum3 = sum3-stack3.pop();
            if(sum1 == sum2 && sum2==sum3) {finalSum = sum1; break;}
            else if(sum1==sum2){
                int top = stack3.peek();
                sum3 = sum3-top;
                if(sum1==sum2 && sum2==sum3){finalSum = sum1; break;};
            }
            else if(sum1 == sum3){
                int top = stack2.peek();
                sum2 = sum2-top;
                if(sum1==sum2 && sum2==sum3){finalSum = sum1; break;};
            }
            else if(sum2 == sum3){
                int top = stack1.peek();
                sum1 = sum1-top;
                if(sum1==sum2 && sum2==sum3){finalSum = sum1; break;};
            }
        }
       return finalSum;
    }
}
