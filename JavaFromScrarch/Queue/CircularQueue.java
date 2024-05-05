package Queue;
public class CircularQueue {
    public static class CircularQueueArray{
        int[] arr = new int[5];
        int fr = -1 , re = -1,size=0;

        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full.");
            } else if(size==0){
                fr = re = 0;
                arr[0] = val;
            } else if(re < arr.length-1){
                arr[++re] = val;
            } else if(re == arr.length-1){
                re = 0;
                arr[0] = val;
            }
            size++;
        }

        public int poll() throws Exception {
            if(size==0){
                throw new Exception("Queue is Empty.");
            } else{
                int val = arr[fr];
                if(fr==arr.length-1) fr = 0;
                else fr++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty.");
            }
            return arr[fr];
        }

        public boolean isEmpty(){
            if(arr.length==size) return true;
            else return false;
        }

        public void display() throws Exception{
            int n = size;
            if(n==0){
               throw new Exception("Queue is Empty.");
            }
            if(fr <= re){
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
            else{
                System.out.print("[");
                for(int i=fr; i<arr.length; i++){
                    if(n-1 > 0){
                        System.out.print(arr[i] + ",");
                        n--;
                    }
                    else{
                        System.out.print(arr[i]);
                    }
                }
                for(int i=0; i<=re; i++){
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
    }
    public static void main(String[] args) {
        CircularQueueArray cq = new CircularQueueArray();
        try {
            cq.add(88);
            cq.add(99);
            cq.add(48);
            cq.add(79);
            cq.add(58);
            cq.display();
            cq.poll();
            cq.poll();
            cq.poll();
            cq.poll();
            cq.poll();
            cq.add(78);
            cq.display();
            System.out.println(cq.size);
            cq.poll();
            cq.add(51);
            cq.add(99);
            cq.add(55);
            cq.display();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
