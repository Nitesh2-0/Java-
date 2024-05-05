package CollectionFramwork.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Nitesh", 18);
        mp.put("Pankaj", 21);
        mp.put("Full", 34);
        mp.put("Sangeeta", 48);
        mp.put("Vinita", 18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Nitesh"));// 18
        System.out.println(mp.get("Rahul"));// null
        //Changing/updating value of a key in the HashMap
        System.out.println(mp.put("Nitesh", 27));// return previous value
        System.out.println(mp.get("Nitesh"));// 27
        //Removing a pair from the HashMap
        System.out.println(mp.remove("Sangeeta")); // return value
        System.out.println(mp.remove("Sangeeta")); // null
        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Sangeeta")); // false
        System.out.println(mp.containsKey("Nitesh")); // true
        System.out.println(mp.containsValue(18)); // true
        System.out.println(mp.containsValue(23)); // false
        //Adding a new entry only if the new key doesn't exist already
        System.out.println(mp.putIfAbsent("Sangeeta", 77)); // null
        System.out.println(mp.putIfAbsent("Nitesh", 88)); // return it prev value
        //Get all Key in the HashMap
        System.out.println(mp.keySet());
        //Get all entries is the HashMap
        System.out.println(mp.values());
        //Traveling all entries of HashMap - multiple method
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d.\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d. \n",e.getKey(),e.getValue());
        }
        System.out.println();
        for(var a : mp.entrySet()){
            System.out.printf("Age of %s id %d.\n",a.getKey(),a.getValue());
        }
    }
}
