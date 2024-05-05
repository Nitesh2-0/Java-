package LeetCode;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows :: ");
        int n = scanner.nextInt();
        List<List<Integer>> sc= generate(n);
        for (List<Integer> innerList : sc) {
            System.out.println(innerList);
        }
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        if(numRows == 1) return result;
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
