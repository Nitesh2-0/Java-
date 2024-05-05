package Exeception;
import java.util.Scanner;

public class Test15 {
    static int squre(int a) throws Exception{
        int max = Integer.MAX_VALUE;
        if(max == a){
            throw new Exception("OutOfIntger Range");
        }
        return a*a;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            System.out.println(squre(n));
        }
        catch(Exception E){
            System.out.println(E);
        }
    }
}
