package GeeksForGeeks;

public class RotateLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static void DisplayList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void reverseList(Node head){
        Node temp = head;
        Node prev = null;
        Node after = null;
        while(temp != null){
            after = temp.next;
            temp.next = prev;
            prev = temp;
            temp = after;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        reverseList(a);
        DisplayList(a);
    }
}
