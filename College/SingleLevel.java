class Animal{
      void barking(String s){
            System.out.println(s + " is barking.");
      }
      String name; 
}
class Dog extends Animal{
      void eating(String s,String s1){
            System.out.println(s + " is eating " + s1 + ".");
      }
      void myname(){
            System.out.println("My name is " + name);
      }
}
public class SingleLevel {
     public static void main(String[] args) {
      Dog d1 = new Dog(); 
      // d1.name =  "Nitesh";
      d1.barking("Dog");
      d1.eating("Dog","meat");
      d1.myname();
      d1.name =  "Nitesh";
     } 
}
