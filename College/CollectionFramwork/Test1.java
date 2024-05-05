package CollectionFramwork;
import java.util.*;
import java.lang.Thread;
public class Test1 extends Thread{
    public void run() {
    
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        Test1 a = new Test1(); 
        try{
            a.start();
            a.start();
        }
        catch(IllegalThreadStateException e){
            System.out.println("IllegalThreadStateException");
        }
      //  a.run();// Behave like simple method 
    }
}
