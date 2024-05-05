package OOPs;
public class Class1 {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.getColor());
        System.out.println(p.getClass());
        p.setTip(5);
        System.out.println(p.getTip());

        Student s = new Student();
        s.name = "Nitesh";
        s.calPercentage(90,99,99);
        System.out.println(s.percentage);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Nitesh Kumar";
        myAcc.setPassword("nitesh167");
    }
}
class Pen {
    private String color;
    private int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
class Student {
    String name;
    int age;
    float percentage; //cgpa
    void calPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String password){
        this.password = password;
    }
}
