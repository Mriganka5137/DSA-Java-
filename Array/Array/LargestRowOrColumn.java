public class LargestRowOrColumn {

    public static int[] rowLargest(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        int[] max= new int[2];
        for(int i=0; i<rows; i++){
            int sum=0;
            for(int j=0; j<cols; j++){
                sum+=arr[i][j];
            }
            if (sum > largest){
                largest=sum;
                max[0]=i;
                max[1]=largest;
            }
        }




        return max;
        
    }

    public static int[] colLargest(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        int[] max= new int[2];
        for(int j=0; j<cols; j++){
            int sum=0;
            for(int i=0; i<rows; i++){
                sum+=arr[i][j];
            }
            if (sum > largest){
                largest=sum;
                max[0]=j;
                max[1]=largest;
            }
        }




        return max;
        
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] rowMax = rowLargest(arr);
        int[] colMax = colLargest(arr);
        // System.out.println(rowMax[1]+" "+rowMax[0]);
        // System.out.println(colMax[1]+" "+colMax[0]); 
        if(rowMax[1] > colMax[1]){
            System.out.println("row " + rowMax[0] + " "+rowMax[1]);
        }
        else{
            System.out.println("column "+ colMax[0]+ " "+colMax[1]);
        }
    }
    
}
