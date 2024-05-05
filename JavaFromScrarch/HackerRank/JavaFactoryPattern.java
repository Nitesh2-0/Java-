package HackerRank;
import java.util.*;
interface Food{
    String getType();
}
class Cake implements Food{
    public String getType(){
        return "Someone ordered a Dessert!";
    }
}
class Pizza implements Food{
    public String getType(){
        return "Someone ordered a fast food!";
    }
}
class FoodFactory{
    public Food getFood(String order){
        if(order.toLowerCase().equals("Cake")){
            Cake cake = new Cake();
            return cake;
        }
        Pizza pizza = new Pizza();
        return pizza;
    }
}
public class JavaFactoryPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Disk like :: cake or Pizza");
        String hold = sc.next();
        FoodFactory foodfactory = new FoodFactory();
        Food food = foodfactory.getFood(hold);
        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }
}
