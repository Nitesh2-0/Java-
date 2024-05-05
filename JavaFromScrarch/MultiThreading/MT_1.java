package MultiThreading;
import java.util.Scanner;
public class MT_1 {
    public void runnable(int a){
        System.out.println("Yes, this is working ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MT_1 m = new MT_1();
        m.runnable(5);
    }
}
