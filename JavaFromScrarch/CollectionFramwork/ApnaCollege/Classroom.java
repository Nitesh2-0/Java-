package CollectionFramwork.ApnaCollege;
import java.util.HashMap;
public class Classroom {
    public static void main(String[] args) {
        // HashMap creation
        HashMap<String,Integer> mp = new HashMap<>();
        // Insert -> O(1)
        mp.put("India", 100);
        mp.put("China", 150);
        mp.put("US",180);
        // print
        System.out.println(mp);
        // Get -> O(1)
        int population = mp.get("India");
        System.out.println(population); // India -> 100
        System.out.println(mp.get("Indonesia")); // Indonesia -> null
        // containsKey -> O(1)
        System.out.println(mp.containsKey("India")); // India -> true
        System.out.println(mp.containsKey("Indonesia")); // India -> false
        // Remove -> O(1)
        System.out.println(mp.remove("China")); // China has been removed.
        System.out.println(mp);
        System.out.println(mp.remove("Indonesia")); // No change in map
        System.out.println(mp);
        // size -> O(1)
        System.out.println(mp.size()); // size -> 2
        // isEmpty -> O(1)
        System.out.println(mp.isEmpty()); // false
        //clear
        mp.clear();
        System.out.println(mp); // {}
    }
}
