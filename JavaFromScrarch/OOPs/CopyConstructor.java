package OOPs;
public class CopyConstructor {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Shradha";
        t.T_Id = 123;
        t.password = "scsjnfsf";
        t.marks[0] = 100;
        t.marks[1] = 99;
        t.marks[2] = 89;

        Teacher t1 = new Teacher(t);
        t1.password  = "xys";
        t1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(t1.marks[i]);
        }

    }
}
class Teacher{
    String name;
    int T_Id;
    String password;
    int[] marks = new int[3];

    //Shallow copy constructor
//    Teacher(Teacher t1){
//         marks = new int[3];
//        this.name = t1.name;
//        this.T_Id = t1.T_Id;
//        this.marks = t1.marks;
//    }
    // Deep copy constructor
    Teacher(Teacher t1){
        marks = new int[3];
        this.name = t1.name;
        this.T_Id = t1.T_Id;
       for(int i=0; i<marks.length; i++){
           this.marks = t1.marks;
       }
    }

    Teacher(){
        System.out.println("Constructor is called...");
    }
    Teacher(String name){
        marks = new int[3];
        this.name = name;
    }
}
