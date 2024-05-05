package CollectionFramwork.ApnaCollege;
import java.util.ArrayList;
import java.util.LinkedList;
public class HashMapCode {
    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private  int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

    private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc)%N;
    }
    private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
    }
    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node> oldBuckets[] = buckets;
        buckets = new LinkedList[N*2];
        N = 2*N;
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int i=0; i<oldBuckets.length; i++){
            LinkedList<Node> ll = oldBuckets[i];
            for(int j=0; j<ll.size(); j++){
                Node node = ll.remove();
                put(node.key,node.value);
            }
        }
    }
    public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double) n/N;
            if(lambda > 2.0){
                rehash();
            }
    }
    public boolean containsKey(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);
        if(di != -1){
           return true;
        }
        return false;
    }
    public V get(K key) {
        int bi = hashFunction(key);
        int di = SearchInLL(key, bi);
        if (di != -1) {
            Node node = buckets[bi].get(di);
            return node.value;
        } else {
            return null;
        }
    }
    public V remove(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key, bi);
        if (di != -1) {
            Node node = buckets[bi].get(di);
            n--;
            return node.value;
        }
        return null;
    }
    public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
    }
    public boolean isEmpty(){
            return n==0;
    }
   }
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("India",150);
        mp.put("China",130);
        mp.put("Russia",80);
        ArrayList<String> keys = mp.keySet();
        for(String key : keys){
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println(mp.remove("Russia"));
        System.out.println(mp.remove("India"));
        System.out.println(mp.get("Russia"));

    }
}
