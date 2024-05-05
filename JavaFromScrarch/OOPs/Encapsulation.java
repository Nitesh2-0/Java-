package OOPs;
public class Encapsulation {
    public static void main(String[] args) {
        Student1 s = new Student1("Nitesh");
        Student1 s1 = new Student1();
        System.out.println(s.name);
    }
}
class Student1 {
    String name;
    int roll;

    Student1(){
        System.out.println("Default Constructor is called.");
    }
    Student1(String name){
        this.name = name;
    }
}