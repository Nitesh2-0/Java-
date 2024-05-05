package GeeksForGeeks;
import java.util.Scanner;
public class DeleteNodeSingleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(6);
        Node c = new Node(3);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        System.out.print("Enter position :: ");
        int idx = sc.nextInt();
        Node curr = deleteNode(a,idx);
        displayList(curr);

    }
    static Node deleteNode(Node head, int x){
        System.out.println(head.data);
        if(x==1) return head.next;
        Node temp = head;
        for(int i=2; i<x; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    static void displayList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
