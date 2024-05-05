package OOPs.Inheritance;

public class FunctionOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.0f,20.1f));
        System.out.println(c.sum(1,2,3));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float c){
        return a+c;
    }
    int sum(int a, int b, int c){
        return a+b+b+c;
    }
}