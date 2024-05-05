package LinkedList;
public class MergeTwoSortedList {
    public static  class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
        }
    }
    public static void display(SinglyLinkedListNode head){
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode s1 = head1;
        SinglyLinkedListNode s2 = head2;
        SinglyLinkedListNode head = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode temp = head;
        while(s1 != null && s2 != null){
            int a = s1.data;
            int b = s2.data;
            if(a==b){
                temp.next = new SinglyLinkedListNode(a);
                temp = temp.next;
                temp.next = new SinglyLinkedListNode(b);
                temp = temp.next;
                s1 = s1.next;
                s2 = s2.next;
            } else if(a < b){
                temp.next = new SinglyLinkedListNode(a);
                temp = temp.next;
                s1 = s1.next;
            } else{
                temp.next = new SinglyLinkedListNode(b);
                temp = temp.next;
                s2 = s2.next;
            }
        }
        while(s1 != null){
            int a = s1.data;
            temp.next = new SinglyLinkedListNode(a);
            temp = temp.next;
            s1 = s1.next;
        }
        while(s2 != null){
            int a = s2.data;
            temp.next = new SinglyLinkedListNode(a);
            temp = temp.next;
            s2 = s2.next;
        }
        return head.next;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode l0 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode l1 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(7);

        l0.next = l1;
        l1.next = l2;
        l2.next = null;

        SinglyLinkedListNode a0 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode a1 = new SinglyLinkedListNode(2);
        a0.next = a1;
        a1.next = null;

        display(l0);
        display(a0);

        SinglyLinkedListNode curr = mergeLists(l0,a0);
        display(curr);
    }
}
