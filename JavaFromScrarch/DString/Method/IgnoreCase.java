package DString.Method;
public class IgnoreCase {
    public static void main(String[] args) {
        String Eq = "Nitesh Kumar";
        String Pq = "Nitesh Kumar";
        String Dq = "nitesh Kumar";

        System.out.println(Eq.equals(Pq));
        System.out.println(Eq.equals(Dq));
        System.out.println(Eq.equalsIgnoreCase(Dq));
    }
}
