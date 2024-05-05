package CollectionFramwork.Interface;
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>(); // does not contain duplicate Element
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(5);
        st.add(6);
        System.out.println(st);
        st.add(2);
        st.add(1);
        st.add(6);
        st.add(47);
        st.add(99);
        st.add(77);
        st.remove(2); // it is printing randomly
        System.out.println(st.contains(2));
        System.out.println(st);
        System.out.println(st.size());
    }
}
