package LinkedList;
public class MaximumTwinSum {
    static class  Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        displayDl1(a);
        System.out.println(pairSum(a));
    }
    public static int pairSum(Node head) {
        int maxSum = Integer.MIN_VALUE;
        int size = lengthOfList(head);
        Node temp = head ;
        for(int i=0; i<size/2-1; i++){
            temp = temp.next;
        }
        Node curr = revList(temp.next);
       temp.next = curr;
       curr = temp;
       Node str = head;
       for(int i=0; i<size/2; i++){
           int curr1 = str.data + temp.next.data;
           maxSum = Math.max(maxSum,curr1);
           temp = temp.next; str = str.next;
       }
        return maxSum;
    }
    static Node revList(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    static int lengthOfList(Node head){
        Node curr = head;
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
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
