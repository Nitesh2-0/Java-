package GeeksForGeeks;
import java.util.*;
public class TopKFrequentElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the K :: ");
        int k = sc.nextInt();
        int[] num = topK(arr,k);
        System.out.println(":: Output ::");
        for (Integer s: num) {
            System.out.print(s + " ");
        }
    }
    public static int[] topK(int[] arr, int k) {
        Map<Integer,Integer> mp  = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if (mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            } else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
        int [] top = new int[k];
        int j = 0;
        System.out.println(maxFreq(mp));
        for(int i=0; i<k; i++){
            int max = maxFreq(mp);
            top[j++] = max;
            mp.remove(max);
        }
        return top;
    }
    public static int maxFreq(Map<Integer,Integer> m){
        int n = m.size();
        int max = Integer.MIN_VALUE;
        int key = 0;
        for(var a : m.keySet()){
            if(a > max){
                max = m.get(a);
                key = a;
            }
        }
        return key;
    }
}
