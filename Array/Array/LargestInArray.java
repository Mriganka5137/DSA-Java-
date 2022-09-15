
import java.util.*;
public class LargestInArray {
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

    public static int Largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = Input();
        int max = Largest(arr);
        System.out.println(max);
    }
    
}
