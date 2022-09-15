public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int index=0;
        for(int i=1; i< n; i++){
            int temp = arr[i];
            int j = i-1;
            for(;j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {4,8,1,11,2,3,7};
        insertionSort(arr);
        for(int i=0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
