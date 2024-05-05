package CollectionFramwork.HashMap;
import java.util.LinkedList;

public class Implementation {
    static class MYHashMp<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){
            buckets = new  LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        public int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }
        private int searchInBuket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        MYHashMp(){
            initBuckets(DEFAULT_CAPACITY);
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n = 0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key,node.value);
                }
            }
        }
        public int cpt(){
            return buckets.length;
        }
        public float load(){
            return (n*0.1f)/buckets.length;
        }
        public int size(){
            return n;
        }
        public void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBuket(currBucket,key);
            if(ei == -1){
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            } else{
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if(n >= (buckets.length*DEFAULT_LOAD_FACTOR)){
                rehash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBuket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBuket(currBucket,key);
            if(ei !=-1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }

    }
    public static void main(String[] args) {
        MYHashMp<String,Integer> mp = new MYHashMp<>();
        System.out.println("Testing :: ");
        mp.put("a",1);
        mp.put("b",2);
        System.out.println(mp.cpt());
        System.out.println(mp.load());
        mp.put("c",3);
        mp.put("x",71);
        mp.put("y",66);
        System.out.println("Size :: " + mp.size());
        mp.put("c",9);

        System.out.println("Get :: " + mp.get("x"));
        System.out.println("Get :: " + mp.get("y"));
        System.out.println("Size :: " + mp.size());
        System.out.println(mp.cpt());
        System.out.println(mp.load());
    }
}
