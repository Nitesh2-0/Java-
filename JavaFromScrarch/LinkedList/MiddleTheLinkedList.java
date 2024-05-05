package LinkedList;
public class MiddleTheLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node curr = middleNode(a);
        displayDl1(curr);
    }
    static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null &&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static void displayDl1(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
