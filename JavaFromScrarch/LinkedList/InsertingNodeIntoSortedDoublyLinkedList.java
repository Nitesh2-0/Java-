package LinkedList;
public class InsertingNodeIntoSortedDoublyLinkedList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(1);
        Node d = new Node(10);
        Node e = new Node(3);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        Node sorted = sortList(a);
        displayDl1(sorted);
        int data = 5;
        Node g = insertNode(a,data);
        displayDl1(g);
    }
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    static Node insertNode(Node head,int data){
        Node temp = head;
        while(temp != null){
            if(temp.data > data) break;
           temp = temp.next;
        }
        Node tar = new Node(data);
        tar.next = temp;
        temp.prev.next = tar;
        tar.prev = temp.prev.next;
        temp.prev = tar;
        return head;
    }
    static Node sortList(Node head){
        // bubble sort
        Node temp1 = head;
        while(temp1 != null){
            Node temp2 = temp1.next;
            while(temp2 != null){
                if(temp1.data > temp2.data){
                    int temp = temp1.data;
                    temp1.data = temp2.data;
                    temp2.data = temp;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return head;
    }
    static Node sortList1(Node head){
        return head;
    }
    static void removeDuplicate(Node head){

    }
    static void displayDl1(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static void displayDl2(Node head){
        Node temp = head;
        System.out.print("null");
        while(temp != null){
            System.out.print(" <- " + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }
}
