package OOPs;
public class StaticKeywords {
    public static void main(String[] args) {
        Students s = new Students();
        s.schoolName = "K.N.SHARMA";
        Students s1 = new Students();
        System.out.println(s1.schoolName);
        Students s2 = new Students();
        s.schoolName = "ABC";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s.schoolName);
    }
}

class Students {
   static float returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
