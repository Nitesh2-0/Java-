package Stack;

import java.sql.SQLOutput;

public class TwoStackInOneArray {
    public static class  Stack{
        int size = 10000;
        int[] arr = new int[size];
        int i=-1 , j=size+1;

        void push1(int x) throws Exception{
            if(i == arr.length) throw new Exception("Error Stack Overflow.");
            arr[++i] = x;
        }

        void push2(int x) throws Exception{
            if(j == 0) throw new Exception("Error Stack Overflow.");
            arr[--j] = x;
        }

        int pop1() throws Exception{
            if(i == -1) throw new Exception("Error Stack Underflow.");
            int data = arr[i--];
            return data;
        }

        int pop2() throws Exception{
            if(j==arr.length+1) throw new Exception("Error Stack Underflow.");
            int data = arr[j++];
            return data;
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
    }
}
