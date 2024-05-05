package CollectionFramwork;
import java.util.*;
public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        HashSet<Integer> set1 = new HashSet<>();
        for(Integer s : arr1){
            set1.add(s);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer j : arr2){
            set2.add(j);
        }
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        if(set1.size() > set2.size()){
            for(Integer k : set1){
                if(set2.contains(k)){
                    union.add(k);
                }else{
                    union.add(k);
                }
            }
            for(Integer k : set2){
                if(set1.contains(k)){
                    union.add(k);
                }else{
                    union.add(k);
                }
            }
        }else{
            for(Integer k : set2){
                if(set1.contains(k)){
                    union.add(k);
                }else{
                    union.add(k);
                }
            }
            for(Integer k : set1){
                if(set2.contains(k)){
                    union.add(k);
                }else{
                    union.add(k);
                }
            }
        }

        if(set1.size() > set2.size()){
            for(Integer k : set1){
                if(set2.contains(k)){
                    intersection.add(k);
                }
            }
        }else{
            for(Integer k : set2){
                if(set1.contains(k)){
                    intersection.add(k);
                }
            }
        }

        System.out.println(union);
        System.out.println(intersection);
        secondMethod(arr1,arr2);
    }
    public static void secondMethod(int[] arr1 , int[] arr2){
        HashSet<Integer> union = new HashSet<>();
        for(Integer k : arr1){
            union.add(k);
        }
        for(Integer t : arr2){
            union.add(t);
        }
        System.out.println(union);

        HashSet<Integer> set = new HashSet<>();
        for(Integer k : arr1){
            set.add(k);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(Integer r : arr2){
            if(set.contains(r)){
                intersection.add(r);
            }
        }
        System.out.println(intersection);
    }
}
