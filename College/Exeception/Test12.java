package Exeception;
import java.io.FileNotFoundException;
class A{
    public void printName() throws FileNotFoundException{
        System.out.println("Name-A");
    }
}
class B extends A{
    public void printName() throws NullPointerException{
        System.out.println("Name-B");
    }
}
public class Test12 {
    public static void main(String[] args) throws Exception{
       A a = new B(); 
       a.printName();                            
    }
}
