package Stack;
public class UsingArray {
    public static class Stack{
            private int[] array = new int[100];
            private int index = 0;
            void push(int ele){
                if(isFull()) {
                    System.out.println("Stack is Full !...");
                    return;
                }
                array[index] = ele;
                index++;
            }
            void pop(){
                if(index == 0){
                    System.out.println("Stack is Underflow!...");
                    return ;
                }
                int popElem = array[index-1];
                index--;
            }
            int peek(){
                if(isEmpty()){
                    System.out.print("Stack is Underflow!... ");
                    return -1;
                }
                int peekElm = array[index-1];
                return peekElm;
            }
            int size(){
                return index;
            }
            int capacity(){
                return array.length;
            }
            boolean isEmpty(){
                if(index==0) return true;
                return false;
            }
            boolean isFull(){
                if(index == array.length){
                    return true;
                }
                return false;
            }
            void display(){
                for(int k=0; k<index; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isFull());
        System.out.println(st.capacity());
        st.pop();
    }
}
