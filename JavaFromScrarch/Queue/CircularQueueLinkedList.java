package Queue;
public class CircularQueueLinkedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLinkedList{
        int size = 0;
        Node fr = null;
        Node re = null;

        public void add(int val){
            Node curr = new Node(val);
            if(size==0){
                re = curr;
                fr = curr;
                re.next = fr;
            } else{
                re.next = curr;
                re = curr;
                re.next = fr;
            }
        }

        public void display(){
            Node temp = fr;
            while(temp != re){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.add(55);
        q.add(95);
        q.add(78);
        q.add(48);
        q.display();
    }
}
