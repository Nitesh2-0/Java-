package HackerRank;
public class ReverseLinkedList {
    public static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedListNode a = new SinglyLinkedListNode(1);
        SinglyLinkedListNode b = new SinglyLinkedListNode(2);
        SinglyLinkedListNode c = new SinglyLinkedListNode(3);
        SinglyLinkedListNode d = new SinglyLinkedListNode(4);
        SinglyLinkedListNode e = new SinglyLinkedListNode(5);
        SinglyLinkedListNode f = new SinglyLinkedListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        reversePrint(a);
    }
    public static void reversePrint(SinglyLinkedListNode llist) {
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode after = null;
        while (curr != null ){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        display(prev);
    }
    static void display(SinglyLinkedListNode head){
       SinglyLinkedListNode temp = head;
       while (temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
        System.out.println();
    }
}
