public class RowWiseSum {

    public static void sumRow(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0; i<rows; i++){
            int sum=0;
            for(int j=0; j<cols; j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
        
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        sumRow(arr);

    }
    
}
