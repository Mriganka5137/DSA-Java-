
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(arr); // arr stores the reference of the array arr[]
    }
}
