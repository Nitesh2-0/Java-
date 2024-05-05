package GarbageCollection;
public class Test1 {
    public void finalize(){
        System.out.println("Object is Deleted");
    }
    public static void main(String[] args) {
        Test1 t = new Test1(); 
        Test1 t1 = new Test1(); 
        t = null; 
        t1 = null;
        System.gc();
        System.out.println(t.equals("Null"));
    }
}
