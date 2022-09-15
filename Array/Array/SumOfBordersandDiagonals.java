public class SumOfBordersandDiagonals {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int sum = sumOfBandD(arr);
        System.out.println(sum);
    }

    public static int sumOfBandD(int[][] arr) {
        int sum=0;
        int l=arr.length;
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                if(i==0 || j==0){
                    sum+=arr[i][j];
                }
                else if (i==l-1 || j==l-1){
                    sum+=arr[i][j];
                }
                else if (i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==l-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
