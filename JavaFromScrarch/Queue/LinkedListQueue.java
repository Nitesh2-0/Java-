package Queue;
public class LinkedListQueue {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }
    public static class LLQueue{
        int  size=0;
        Node fr = new Node(-1);
        Node re = fr;

        public void add(int val){
            Node curr = new Node(val);
            re.next = curr;
            re = curr;
            size++;
        }
        public int remove(){
            if(size==0){
                return -1;
            }
            size--;
            int data = fr.next.data;
            fr = fr.next;
            return data;
        }

        public void display(){
            if(size==0){
                System.out.println("♾️ Queue is Empty.");
                return;
            }
            Node temp = fr.next;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int peek(){
            if(size==0){
                System.out.println("💡 is Empty.");
                return -1;
            }
            return fr.next.data;
        }
    }
    public static void main(String[] args) {
        LLQueue lq = new LLQueue();
        System.out.println(lq.size);
        lq.display();
        lq.add(8);
        lq.add(9);
        lq.add(10);
        lq.add(11);
        lq.add(12);
        lq.display();
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
        System.out.println(lq.size);
        System.out.println(lq.peek());
        System.out.println(lq.remove());
    }
}
