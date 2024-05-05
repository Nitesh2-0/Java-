package HackerRank;
public class DeleteNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
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

        display(a);
        Node curr = deleteNode(a,2);
        display(curr);
    }
    public static Node deleteNode(Node llist, int position){
        if(position == 0){
            return llist.next;
        }
        Node temp = llist;
        for(int i=1; i<position; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return llist;
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
