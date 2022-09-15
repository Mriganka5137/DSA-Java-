public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(arr1);
    }
    public static void print2DArray (int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            int x = n-i;
            while( x >0){
                for(int j=0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                x--;
            }
        
        }
    }
}
