package Queue;
public class LinkedListQueue1 {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }
    public static class QueueLL{
        int size = 0;
        Node fr = null;
        Node re = null;

        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                fr = re = temp;
            } else{
                re.next = temp;
                re = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty.");
                return  -1;
            }
            return fr.data;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return -1;
            }
            int data = fr.data;
            fr = fr.next;
            size--;
            return data;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        public void display(){
            Node temp = fr;
            int n = size;
            System.out.print("[");
            while(temp != null){
                if(n-1 > 0){
                    System.out.print(temp.data + ",");
                    n--;
                } else{
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        QueueLL lq = new QueueLL();
        System.out.println(lq.size);
        lq.display();
        lq.add(8);
        lq.add(9);
        lq.add(10);
        lq.add(11);
        lq.add(12);
        lq.display();
        System.out.println(lq.size);
        System.out.println(lq.isEmpty());
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        lq.display();
    }
}
