
import java.util.*;
public class InputOfArray{

    public static int[] Input() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Taking input for "+ i +"th index");
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void PrintArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static  void IncrementArray(int[] arr) {
        for(int i=0; i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
    }


    public static void main(String[] args) {
        int[] arr = Input();
        IncrementArray(arr);
        PrintArray(arr);
        
      

    }
}