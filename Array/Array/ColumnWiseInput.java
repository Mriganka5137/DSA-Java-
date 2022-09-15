import java.util.Scanner;

public class ColumnWiseInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr= new int[rows][cols];
        for(int i = 0; i<cols; i++){
            for(int j=0; j<rows; j++){
                arr[j][i]=s.nextInt();
            }
        }

        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
