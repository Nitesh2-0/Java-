package HackerRank;
public class InsertAtSpecificPosition {
    public static class SinglyLinkedListNode{
        int data;
       SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
            next = null;
        }
    }
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode list, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode head = list;
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        SinglyLinkedListNode temp = head;
        for(int i=1; i<position; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    static void displayNode(SinglyLinkedListNode head){
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     SinglyLinkedListNode a = new SinglyLinkedListNode(1);
     SinglyLinkedListNode b = new SinglyLinkedListNode(11);
     SinglyLinkedListNode c = new SinglyLinkedListNode(111);
     SinglyLinkedListNode d = new SinglyLinkedListNode(1111);
     SinglyLinkedListNode e = new SinglyLinkedListNode(11111);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayNode(a);
        SinglyLinkedListNode curr = insertNodeAtPosition(a,5,2);
        displayNode(curr);
    }
}
