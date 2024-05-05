package Exeception;
public class Test8 {
    static int val = 50; 
    public static int getValue(String s){
      if(s==null){
            throw new IllegalArgumentException("Argument can not be null"); 
        } 
     return val;   
    }    public static void main(String[] args) {
       String s = null; 
       try{
        System.out.println(getValue(s));
       }
        catch(IllegalArgumentException e){
        System.out.println("illegalArgumentExeception ");
       }

       s = "jpt"; 
       try{
        System.out.println(getValue(s));
       }
        catch(IllegalArgumentException e){
        System.out.println("illegalArgumentExeception ");
       }
    }
}
