package CollectionFramwork.HashSet;
import java.util.HashSet;
public class Test1 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Nitesh Kumar");
        st.add("James");
        st.add("James");
        System.out.println(st);
        System.out.println(st.contains("James")); // A -> true
        System.out.println(st.size()); // A-> 2
        st.remove("James"); // A -> James has removed.
        System.out.println(st.contains("James")); // A -> false
        System.out.println(st.size()); // A-> 1
        st.add("Mark");
        for(String s : st){
            System.out.print(s + " ");
        }
    }
}
