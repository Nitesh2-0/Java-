package HackerRank;
import org.w3c.dom.ls.LSInput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class SparseArrays {
    public static void main(String[] args) {
        String[] array = {"aba","baba","aba","xzxb"};
        List<String> stringList = Arrays.asList(array);
        String[] qu = {"ab","abc","bc"};
        List<String> queries  = Arrays.asList(qu);
        System.out.println("stringList :: " + stringList);
        System.out.println("queries :: " + queries);
        List<Integer> result  = matchingStrings(stringList,queries);
        System.out.println("result :: " + result);
    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> adding = new ArrayList<>();
        int n1 = stringList.size(),count = 0;
        int n2 = queries.size();
        for(int i=0; i<n2; i++){
            for(int j=0; j<n1; j++){
                if(stringList.get(j).equals(queries.get(i))){
                    count++;
                }
            }
            adding.add(count);
            count = 0;
        }
        return adding;
    }
}
