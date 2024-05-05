package Stack;
public class UsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static  class Stack {
       private Node head = null;
       private int len = 0 ;

       void push(int ele){
          Node temp = new Node(ele);
          temp.next = head;
          head = temp;
          len++;
       }

       int pop(){
           if(isEmpty()){
               System.out.println("Error!, Stack is Empty...");
               return -1;
           }
           int currVal = head.data;
           head = head.next;
           len--;
           return currVal;
       }

       int peek(){
           return head.data;
       }

       int size(){
           return len;
       }

       private void displayRecursively(Node head){
           if(head == null) return;
           displayRecursively(head.next);
           System.out.print(head.data + " ");
       }

       void display(){
           Node temp = head;
           displayRecursively(temp);
           System.out.println();
       }

       void displayRev(){
           Node temp = head;
           while(temp != null){
               System.out.print(temp.data +  " ");
               temp = temp.next;
           }
           System.out.println();
       }

       boolean isEmpty(){
           if(head==null || len==0) {
               return true;
           }
           return false;
       }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
//        st.push(99);
//        st.push(88);
//        st.pop();
//
//        System.out.println(st.size());
//        st.display();
//        System.out.println(st.isEmpty());
//        System.out.println(st.peek());
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        st.push(4);
        st.pop();
        st.display();
    }
}
