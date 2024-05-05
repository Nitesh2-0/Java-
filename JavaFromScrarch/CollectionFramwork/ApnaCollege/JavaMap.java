package CollectionFramwork.ApnaCollege;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        sc.nextLine();
        while(t-- > 0){
            String name = sc.nextLine();
            int number = sc.nextInt();
            mp.put(name,number);
            sc.nextLine();
        }
        while(n-- > 0){
            String name = sc.nextLine();
                if(mp.containsKey(name)){
                    System.out.println(name +"=" + mp.get(name));
                }
                else{
                    System.out.println("Not found");
                }
        }
    }
}
