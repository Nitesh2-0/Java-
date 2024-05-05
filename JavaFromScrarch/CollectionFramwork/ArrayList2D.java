package CollectionFramwork;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
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

        for (int i=0; i<University.size(); i++){
            for (int j=0; j<University.get(i).size(); j++){
                System.out.print(University.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(University.get(2).get(3));
    }
}
