package Exeception;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Test1.myMethod());
    }
     public static int myMethod(){
        try{
            return 112; 
        }
        finally{
            System.out.println("This is the finally block");
            System.out.println("My name is Nitesh");
        }
    }
}
