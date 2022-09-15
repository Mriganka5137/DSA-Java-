import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int i=0; i<arr.length;i++){
            arr[i] = new int[i*2+1];
        }
        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
