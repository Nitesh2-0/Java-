package LinkedList;
public class RemoveNthNodeFromEndList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        int n = 1;
        ListNode holder = removeNthFromEnd(l1,n);
        display(holder);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = sizeOfList(head);
        ListNode pointer = head;
        int common = size-n;
        if(common==0) return head.next;
        for(int i=0; i<common-1; i++){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        return head;
    }
    static int sizeOfList(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    static void display(ListNode head){
        ListNode l1 = head;
        while (l1 != null){
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
        System.out.println();
    }
}
