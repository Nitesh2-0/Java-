package CollectionFramwork;
import java.util.ArrayList;

public class ArrayListSwapping2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> University = new ArrayList<>();

        //College Data
        ArrayList<String> college = new ArrayList<>();
        college.add("TIT");
        college.add("TIT&E");
        college.add("TIT&S");
        college.add("TIT-CSE");

        //Course
        ArrayList<String> course = new ArrayList<>();
        course.add("CS");
        course.add("AIML");
        course.add("IT");
        course.add("ME");

        // fess
        ArrayList<String> fees = new ArrayList<>();
        fees.add("100000");
        fees.add("90000");
        fees.add("80000");
        fees.add("50000");

        University.add(college);
        University.add(course);
        University.add(fees);

        System.out.println(University);
        int n = University.size();
        for(int i=0; i<Math.floor(University.size()/2); i++){
            for(int j=0; j<University.get(i).size(); j++){
                String temp = University.get(i).get(j);
                University.get(i).set(j,University.get(n-i-1).get(j));
                University.get(n-1-i).set(j,temp);
            }
        }
        System.out.println(University);
    }
}
