package Exeception;
import java.util.*;
public class Test14 {
    static int cube(int n) throws Exception{
        if(100 < n) {
          throw new Exception("NoCubeExeception");
        }
       return n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            System.out.println(cube(n));
        }
        catch(Exception E){
            System.out.println(E);
        }
        finally{
            System.out.println("This is the Finally block");
        }
    }
}
