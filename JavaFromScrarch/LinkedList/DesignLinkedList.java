package LinkedList;
public class DesignLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class MyLinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void display(){
            if(head==null) {
                System.out.println("Sorry! 😥 Head at null....");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void addAtHead(int val){
            Node curr = new Node(val);
            if(head==null){
                addAtTail(val);
                return ;
            }
            else {
                curr.next = head;
                head = curr;
            }
            size++;
        }

        public void addAtTail(int val){
            Node curr = new Node(val);
            if(head==null){
                head=curr;
            }
            else {
                tail.next = curr;
            }
            tail = curr;
            size++;
        }

        public void addAtIndex(int index, int val){
            if(index==0){
                addAtHead(val);
                return ;
            }
            Node temp = head;
            Node curr = new Node(val);
            for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index==0) {
                head = head.next;
                size--; return;
            }
            Node temp = head;
            for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        public int get(int index) {
            if(size==0) {
                System.out.println("Index out ofBound..!");
                return -1;
            }
            if(index == 0){
                return head.data;
            }
            Node temp = head.next;
            for(int i=1; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        MyLinkedList ml = new MyLinkedList();
        ml.addAtHead(1);
        ml.display();
        ml.addAtTail(3);
        ml.display();
        ml.addAtIndex(1,2);
        ml.display();
        System.out.println(ml.get(1));

//        System.out.println( ml.get(0)+ " " + ml.get(5));
    }
}
