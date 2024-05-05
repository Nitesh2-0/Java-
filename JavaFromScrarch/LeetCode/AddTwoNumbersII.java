package LeetCode;
public class AddTwoNumbersII {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2); 
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(4);

        l5.next = l6;
        l6.next = l7;
        l7.next = null;
        display(l1);
        display(l5);
        ListNode Holder = addTwoNumbers(l1,l5);
        display(Holder);
    }
    static ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode after = null;
        ListNode previous = null;

        while(curr != null){
            after = curr.next;
            curr.next = previous;
            previous = curr;
            curr = after;
        }
        return previous;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c = reverseList(l1);
        ListNode d = reverseList(l2);
        ListNode li = new ListNode(-70);
        ListNode l = li;
        int carry = 0 ;
        while(c != null && d != null){
            int sum = c.val + d.val + carry;
            if(sum > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(sum);
                int data  = sb.charAt(1)-48;
                ListNode curr = new ListNode(data);
                carry = sb.charAt(0)-48;
                li.next = curr;
                li = curr;
                sb = new StringBuilder();
            } else {
                ListNode curr = new ListNode(sum);
                carry = 0;
                li.next = curr;
                li = curr;
            }
            c = c.next; d = d.next;
        }
        while(c != null){
            int sum = c.val + carry;
            if(sum > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(sum);
                int data  = sb.charAt(1)-48;
                ListNode curr = new ListNode(data);
                carry = sb.charAt(0)-48;
                li.next = curr;
                li = curr;
                sb = new StringBuilder();
            } else {
                ListNode curr = new ListNode(sum);
                carry = 0;
                li.next = curr;
                li = curr;
            }
            c = c.next;
        }

        while(d != null){
            int sum = d.val + carry;
            if(sum > 9){
                StringBuilder sb = new StringBuilder();
                sb.append(sum);
                int data  = sb.charAt(1)-48;
                ListNode curr = new ListNode(data);
                carry = sb.charAt(0)-48;
                li.next = curr;
                li = curr;
                sb = new StringBuilder();
            } else {
                ListNode curr = new ListNode(sum);
                carry = 0;
                li.next = curr;
                li = curr;
            }
            d = d.next;
        }
        if(carry > 0){
            ListNode curr = new ListNode(carry);
            carry = 0;
            li.next = curr;
            li = curr;
        }
        ListNode ans = reverseList(l.next);
        return ans;
    }
}
