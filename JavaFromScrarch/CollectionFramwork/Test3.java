package CollectionFramwork;

public class Test3 {
    public void m1(float f){
        System.out.println("A");
    }
    public void m1(double f){
        System.out.println("B");
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.m1(12L);
    }
}
