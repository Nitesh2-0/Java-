package LeetCode;
import java.util.Scanner;
public class SwapNodesPairs {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static Node swapPairs(Node head) {
        if(head == null) return head;
        if(length(head)<4) return head;
        Node ptr1 = head;
        Node ptr2 = ptr1.next.next;
        
        return head;
    }
    static int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count++;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node (3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        displayList(a);
        Node curr = swapPairs(a);
    }
    static void displayList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
