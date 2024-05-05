package LinkedList;
public class Palindrome {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static void linkedListDisplay(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static void linkedListDisplayRev(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(4);
        Node g = new Node(3);
        Node h = new Node(2);
        Node i = new Node(1);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = h;
        h.prev = g;
        h.next = i;
        i.prev = h;
        i.next = null;

        linkedListDisplay(a);
        linkedListDisplayRev(i);
        System.out.println("Ans ::: " + isPalindrome(a));
    }
    static boolean isPalindrome(Node head){
       Node str = head;
       Node end = head;
       int size = 0;
       while(end.next != null){
           size++;
           end = end.next;
       }
        while(str != end){
            if(str.data != end.data) return false;
            str = str.next;
            end = end.prev;
        }
       return true;
    }
}
