package LinkedList;
public class TwoSumDo {
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
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.next = null;
        int targetSum = 11;
        linkedListDisplay(a);
        System.out.println("Target value :: " + targetSum);
        System.out.println("Ans :: " + isPresent(a,targetSum));
    }
    static boolean isPresent(Node headNode, int target){
        Node Head = headNode;
        Node Tail = headNode;
        while(Tail.next != null){
            Tail = Tail.next;
        }
        while(Head != Tail){
            int sum = Head.data + Tail.data;
            if(sum == target) return true;
            else if(sum < target) Head = Head.next;
            else Tail = Tail.next;
        }
        return false;
    }
}
