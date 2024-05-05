package Array;

public class SwapUsingThirdVar {
    public static void main(String[] args) {
        int a = 40;
        int b = 80;
        System.out.println(a + " <==> " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " <==> " + b);
    }
}
