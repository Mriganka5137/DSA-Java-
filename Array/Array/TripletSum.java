import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TripletSum {

    public static int tripletSum(int[] arr) {
        int count = 0;
        int x=12;
        int l = arr.length;
        for(int i = 0; i < l-2; i++){
            for(int j= i+1; j <l-1; j++){
                for(int k = j+1; k < l; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        //System.out.println(arr[i]+ " "+ arr[j]+" "+ arr[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int num = tripletSum(arr);
        System.out.println(num);
    }
}
