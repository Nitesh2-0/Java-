package SortingAlgorithum;

import java.util.ArrayList;

public class RunningTimeOfAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        /*list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);*/
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);
        int oper = 0;
        for(int i=1; i<list.size(); i++){
            int j = i;
            while(j > 0 && list.get(j) < list.get(j-1)){
                swap(list,j,j-1);
                oper++;
                j--;
            }
        }
        System.out.println(list);
        System.out.println(oper);
    }
    static void swap(ArrayList<Integer> a, int i, int j){
        Integer temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
    }
}
