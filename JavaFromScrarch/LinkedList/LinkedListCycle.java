package LinkedList;
public class LinkedListCycle {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            slow = slow.next;
            if(fast==null || fast.next==null) return false;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        System.out.println(hasCycle(n1));
    }
}
