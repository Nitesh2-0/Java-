package CollectionFramwork.Interface;
import java.util.*;
public class ListInterface {
    static void ArrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(8);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,1000);
        System.out.println(l);
        System.out.println(l.contains(10));

    }
    static void LinkedListExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(88);
        l.add(77);
        l.add(45);
        l.add(1);
        l.add(2);
        l.add(8);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,1000);
        System.out.println(l);
    }
    static void StackExample(){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(30);
        s.push(44);
        s.push(99);
        System.out.println(s); // 5 10 30 44 99
        System.out.println(s.pop()); // 99
        System.out.println(s.peek()); // 44
        System.out.println(s.search(5)); // it gives index of target
        System.out.println(s.isEmpty());
        System.out.println(s.size());// 4
    }
    static void QueueExample(){
        Queue<Integer> q = new LinkedList<>();
        q.add(888);
        q.add(8888);
        q.add(88888);
        q.offer(888888);
        q.offer(8888888);
        System.out.println(q.element());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
    static void PriorityQueueExample(){
//       Min Based Priority Queue =>
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min PQ
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());//the smallest Element has the Highest
        System.out.println(pq);// Priority
        System.out.println(pq.poll());// 5
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    static void PriorityQueueExample1(){
//       MAX Based Priority Queue =>
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // min PQ
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());//the smallest Element has the Highest
        System.out.println(pq);// Priority
        System.out.println(pq.poll());// 5
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    static void DequeExample(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.peekLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq);
    }
    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        StackExample();
        QueueExample();
        PriorityQueueExample();
        PriorityQueueExample1();
        DequeExample();
    }
}
