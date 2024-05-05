package LinkedList;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
public class RecDisplay {
    public static void length(Node head) {
        if (head == null) {
            return ;
        }
        System.out.print(head.val+ " ");
        length(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        length(head);
    }
}
