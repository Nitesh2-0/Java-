package CollectionFramwork.MapInterfaceJava;
import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> mp = new TreeMap<>();
        mp.put(7,"Nitesh");
        mp.put(1,"Dinesh");
        mp.put(2,"Ramesh");
        mp.put(4,"Kailash");
        mp.put(5,"Grow Chart");
        mp.put(1,"Pria");// over-ride
        mp.putIfAbsent(2,"Ramesh");
        System.out.println(mp);
        System.out.println(mp.get(2));//Dinesh
        System.out.println(mp.containsKey(4));//true
        System.out.println(mp.containsValue("Riya"));//false
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        //iterating over keys in map
        for (Integer i : mp.keySet()){
            System.out.print(i + " ");
        }
        System.out.println();
        for (var s : mp.values()){
            System.out.print(s + " ");
        }
        System.out.println();
//        iterate over the key, value mapping
        for (var e : mp.entrySet()){
            System.out.print(e.getKey() + " -> " + e.getValue() + " ");
        }
    }
}
