package HackerRank;
public class GetNodeValue {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
   static int getNode(Node head, int positionFromTail){
       Node head1 = rev(head);
       Node temp = head1;
       for(int i=0; i<positionFromTail; i++){
           temp = temp.next;
       }
        return temp.data;
    }
   static Node rev(Node head){
        Node curr = head;
        Node after = null;
        Node prev = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(1);

        a.next = b;
        b.next = c;
        c.next = null;

        System.out.println("Ans :: " + getNode(a,2));
    }
}
