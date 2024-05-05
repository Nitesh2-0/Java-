package LinkedList;
import java.util.Scanner;

public class DeleteDuplicateValue {
    static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void printList(SinglyLinkedListNode head){
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static SinglyLinkedListNode insertAtEnd(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode curr = new SinglyLinkedListNode(data);
        if(head==null){
            head = curr;
        } else{
            SinglyLinkedListNode currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = curr;
        }
        return head;
    }
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist){
        SinglyLinkedListNode temp = llist;
        while(temp.next != null){
            int a = temp.data;
            int b = temp.next.data;
            if(a == b){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return llist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            SinglyLinkedListNode head = null;
            for(int i=0; i<n; i++){
                int a = sc.nextInt();
                head = insertAtEnd(head,a);
            }
            SinglyLinkedListNode curr = removeDuplicates(head);
            printList(curr);
        }
    }
}
