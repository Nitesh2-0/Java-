package HackerRank;
import java.util.*;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :: ");
        String str = sc.next();
        System.out.println(timeConversion(str));
    }
    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder(s);
        String hr = sb.substring(0,2);
        String min = sb.substring(3,5);
        String sec = sb.substring(6,8);
        String track = sb.substring(8,10);
        track.toUpperCase();
       if(track.equals("PM")){
           if(hr.equals("12")){
               return hr+":"+min+":"+sec;
           }
           else{
               int convert =Integer.parseInt(hr);
               int currHr = convert+12;
               hr = String.valueOf(currHr);
               return hr+":"+min+":"+sec;
           }
       }
       else {
           if (hr.equals("12")) {
               return "00:"+ min+":"+ sec;
           }
       }
       return hr+":"+min+":"+sec;
    }
}
