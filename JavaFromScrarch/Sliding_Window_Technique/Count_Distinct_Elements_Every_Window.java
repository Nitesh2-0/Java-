package Sliding_Window_Technique;

import java.util.ArrayList;
import java.util.HashSet;

public class Count_Distinct_Elements_Every_Window {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int n = arr.length;
        int k = 4;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int i=0, j=0;
        while(j < n){
            //set.add(arr[j]);
            if(j-i+1 == k){
                for(int p=i; p<k; p++){
                    set.add(arr[i]);
                }
                list.add(set.size());
                set = new HashSet<>();
                i++;
            }
            j++;
        }
        System.out.println(list);
    }
}
