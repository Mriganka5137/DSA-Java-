public class ColSumLargest {

    public static void sumCol(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largestColSum= Integer.MIN_VALUE;
        for(int j =0; j<cols; j++){
            int sum=0;
            for(int i=0; i<rows; i++){
                sum+=arr[i][j];
            }
            if(sum > largestColSum){
                largestColSum = sum;
            }
        }
        System.out.println(largestColSum);
    }

    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        sumCol(arr);
    }   
}
