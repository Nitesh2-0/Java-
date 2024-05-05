package Array;
public class Swap {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        System.out.println(a + " " + b);
            a = a + b;
            b = a - b;
            a = a - b;
        System.out.println(a + " " + b);
    }
}
