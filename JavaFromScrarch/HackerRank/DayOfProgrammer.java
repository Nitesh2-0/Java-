package HackerRank;
import java.util.Scanner;
public class DayOfProgrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :: ");
        int year = sc.nextInt();
        System.out.println("Ans = " + dayOfProgrammer(year));
    }
    public static String dayOfProgrammer(int year) {
        //From 1700 to 1917, Russia's official calendar was the Julian calendar
        if((year >= 1700 && year <= 1917) && year%4==0)
            return "12.09."+year;
        //since 1919 they used the Gregorian calendar system.
        else if((year%400==0)||((year%4==0) && (year%100!=0)))
            return "12.09."+year;
        else if(year == 1918) return "26.09.1918";
        return "13.09."+year;
    }
}
