package CollectionFramwork;
import java.util.*;
public class ItineraryTickets {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        for(String tr : tickets.keySet()){
            revMap.put(tickets.get(tr),tr);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key))
                return key;
        }
        return "";
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String strt = getStart(tickets);
        System.out.print(strt);
        for(String key : tickets.keySet()){
            System.out.print("->" + tickets.get(strt));
            strt = tickets.get(strt);
        }
    }
}
