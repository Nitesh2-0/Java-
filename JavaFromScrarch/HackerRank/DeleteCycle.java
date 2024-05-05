package HackerRank;
public class DeleteCycle {
    public static class Node{
         int val;
         Node next;
        Node(int data){
            this.val = data;
            next = null;
        }
    }
    static boolean hasCycle(Node head) {
        Node low = head;
        Node fast = head;
        if(head == null || head.next==null) return false;
       while(fast != null){
            low = low.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(low==fast) return true;
        }
      return false;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = null;

        System.out.println(hasCycle(a));
    }
}
