public class RotateArray {

    public static void ReverseArr(int start, int end, int[] arr){
        while(start < end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }



    }


    public static void main(String[] args) {
        
    
        int arr[] = {1,2,3,4,5,6,7};
        int n = 1;
        int l = arr.length;
        // while( n > 0){
        //     int temp = arr[0];
        //     for(int i =1; i < l;i++ ){
        //         arr[i-1] = arr[i];
        //     }
        //     arr[l-1] = temp;
        //     n--;
        // }

        ReverseArr(0,l-1,arr);
        ReverseArr(0,l-n-1, arr);
        ReverseArr(l-n, l-1, arr);









        for(int i=0; i < l; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
