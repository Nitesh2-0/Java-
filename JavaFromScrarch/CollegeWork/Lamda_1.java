package CollegeWork;

public class Lamda_1 {
    interface func1{
        int operation(int a, int b);
    }
    interface func2{
        void sayMsg(String msg);
    }
    private int operate(int a, int b, func1 fob){
        return fob.operation(a,b);
    }
    public static void main(String[] args) {
        func1 add = (int x, int y) -> (x+y);
        func1 mul = (int x, int y) -> (x*y);
        Lamda_1 obj = new Lamda_1();
        System.out.println("Addition : " + obj.operate(6,3,add));
        System.out.println("Multiply : " + obj.operate(6,3,mul));
        func2 oj = msg -> System.out.println("Massage is  : " + "Hello"+msg);
        oj.sayMsg("Dynamic Programming");
    }

}
