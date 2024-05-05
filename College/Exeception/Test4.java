package Exeception;

public class Test4 {
    public static final String inputString ="12.3";
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(inputString);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            // System.out.println("Invalid String in argument");
            System.err.println("Invalid String in Argument");
        }
    }
}
