import java.util.Scanner;
public class ReverseVowelsString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the String :: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int i=0, j=arr.length-1;
       while(i <= j){
           if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
               if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U'){
                   swap(i,j,arr);
                   i++; j--;
               }
               else{
                   j--;
               }
           }
           else if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U'){
               if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                   swap(i,j,arr);
                   i++; j--;
               }
               else{
                   i++;
               }
           }
           else{
               i++; j--;
           }
       }
       String s = "";
       for(char c: arr){
           s += c;
       }
        System.out.println(s);
    }
    static void swap(int i, int j, char[] arr){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
