package HackerRank;
import java.util.Scanner;
public class InsertNodeTailLinkedList {
    public static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
            next = null;
        }
    }

    static  SinglyLinkedListNode insertAtLast(int a,SinglyLinkedListNode head){
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(a);
        if(head == null) return head=newNode;
        SinglyLinkedListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }
    static void displayNode(SinglyLinkedListNode head){
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedListNode a = new SinglyLinkedListNode(1);
        SinglyLinkedListNode b = new SinglyLinkedListNode(11);
        SinglyLinkedListNode c = new SinglyLinkedListNode(111);
        SinglyLinkedListNode d = new SinglyLinkedListNode(1111);
        SinglyLinkedListNode e = new SinglyLinkedListNode(11111);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayNode(a);
        SinglyLinkedListNode curr = insertAtLast(5,a);
        displayNode(curr);
    }
}
