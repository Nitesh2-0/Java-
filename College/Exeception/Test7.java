package Exeception;

public class Test7 {
    public static void main(String[] args) {
        String str = null; 
        String msg = (str==null) ? "null value" : str.concat("JPT"); 
        System.out.println(msg);
        str = "Java"; 
        msg = (str.equals("null")) ? "null value" : str.concat("JPT");
        System.out.println(msg);
    }
}
