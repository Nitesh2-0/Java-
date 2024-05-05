package LinkedList;
public class AddTwoNumbers {
    public static class Node{
        int data;
        Node  next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(9);
       Node b = new Node(9);
       Node c = new Node(9);
       Node d = new Node(9);
       Node e = new Node(9);
       Node f = new Node(9);
       Node g = new Node(9);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;
       f.next = g;
       g.next = null;

        Node a1 = new Node(9);
        Node b1 = new Node(9);
        Node c1 = new Node(9);
        Node d1 = new Node(9);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = null;
        display(a);
        display(a1);
        inOneTravel(a,a1);
    }
    static void inOneTravel(Node head1 , Node head2){
        //Correct answer.. O(N) - TC
        Node l1 = head1;
        Node l2 = head2;
        int carry = 0;
        Node pointer = new Node(-70);
        Node ptr = pointer;
        while(l1 != null && l2 != null){
            int total = l1.data + l2.data + carry;
            if(total > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(total);
                int val = sb.charAt(1)-48;
                Node curr = new Node(val);
                carry = (int) sb.charAt(0)-48;
                ptr.next = curr;
                ptr = curr;
                sb = new StringBuilder();
                l1 = l1.next; l2 = l2.next;
            }
            else {
                Node curr = new Node(total);
                ptr.next = curr;
                ptr = curr;
                l1 = l1.next; l2 = l2.next;
                carry = 0;
            }
        }
        while(l1 != null){
            int total = carry + l1.data;
            if(total > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(total);
                int val = sb.charAt(1)-48;
                Node curr = new Node(val);
                carry = (int) sb.charAt(0)-48;
                ptr.next = curr;
                ptr = curr;
                sb = new StringBuilder();
                l1 = l1.next;
            }
            else{
                Node curr = new Node(total);
                ptr.next = curr;
                ptr = curr;
                l1 = l1.next;
                carry = 0;
            }
        }
        while(l2 != null){
            int total = carry + l2.data;
            if(total > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(total);
                int val = sb.charAt(1)-48;
                Node curr = new Node(val);
                carry = (int) sb.charAt(0)-48;
                ptr.next = curr;
                ptr = curr;
                sb = new StringBuilder();
                l2 = l2.next;
            }
            else{
                Node curr = new Node(total);
                ptr.next = curr;
                ptr = curr;
                l2 = l2.next;
                carry = 0;
            }
        }
        if(carry > 0){
            Node curr = new Node(carry);
            ptr.next = curr;
            ptr = curr;
        }
        display(pointer.next);
    }
    static void calculation(Node head1,Node head2){
        //According to maths this logic is well but According to question this is not good
        int list1 = makeInteger(head1);
        int list2 = makeInteger(head2);
        StringBuilder str = new StringBuilder();
        str.append((list1+list2));
        str.reverse();
        Node head = new Node(-1);
        Node temp = head;
        for(int i=0; i<str.length(); i++){
            int a = (int) str.charAt(i);
            Node curr = new Node(a-48);
            temp.next = curr;
            temp = curr;
        }
        display(head.next);
    }
    static int makeInteger(Node head){
        Node temp = head;
        String cull = "";
        while(temp != null){
            cull += temp.data;
            temp = temp.next;
        }
        return Integer.parseInt(cull);
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
