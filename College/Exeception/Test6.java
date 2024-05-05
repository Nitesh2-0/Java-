package Exeception;

public class Test6 {
    public static void main(String[] args) {
        String pt = null; 
        try{
            // if(pt.equals("PPP")){
            //     System.out.println("Same");
            // }
            // System.out.println("Not Smae");
            String st = (pt.equals(pt)) ? "YES" : "NO";
            System.out.println(st);
        }
        catch(NullPointerException e){
            System.out.println("NullPointerExeception caught");
        }
    }
}
