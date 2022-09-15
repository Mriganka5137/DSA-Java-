public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2,0,0,1,3,0,0};
        int i=0;
        int nonZero=0;
        for(;i < arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = 0;//arr[nonZero];
                arr[nonZero] =temp;
                nonZero++;
            }
        }
        

         for(int k=0; k<arr.length;k++){
             System.out.print(arr[k]+" ");

         } 
    }
    
}
