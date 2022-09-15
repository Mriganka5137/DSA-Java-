public class InsertionSort2 {
    public static void main(String[] args) {
        int arr[] = {45,12,1,3,45,0,4,5,78,6};
        insertSort(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }   


    public static void insertSort(int arr[]) {
        int n = arr.length;
        for(int i=1; i < n; i++ ){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        
    }
}
