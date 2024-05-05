package Queue;
public class ArrayQueue {
    public static  class QueueA{
        int size = 0;
        int fr = -1, re = -1;
        int[] arr = new int[1000];

        public void add(int val){
            if(re==arr.length){
                System.out.println("Sorry 😥, Queue is Full.");
                return ;
            }
            if(re==-1){
                fr = re = 0;
                arr[0] = val;
            } else{
                arr[++re] = val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("☠️ Queue is Empty.");
                return -1;
            }
            fr++;
            size--;
            return arr[fr-1];
        }

        public int peek(){
            if(size==0) {
                System.out.println("☠️Queue is Empty. ");
                return -1;
            }
            return arr[fr];
        }

        public void display(){
            int n = size;
            if(size==0){
                System.out.println("😥 Queue is Empty. ");
                return ;
            }
            System.out.print("[");
            for(int i=fr; i<= re; i++){
                if(n-1 > 0){
                    System.out.print(arr[i] + ",");
                    n--;
                }
                else{
                    System.out.print(arr[i]);
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
