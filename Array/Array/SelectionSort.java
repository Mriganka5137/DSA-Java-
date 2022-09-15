public class SelectionSort {

    public static void selecSort(int[] arr) {
        int min;
        int l=arr.length;
        for(int i = 0; i < l-1; i++){
            min=i;
            for(int j = i + 1; j < l; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,7,1,56,14,5,0,78,1,2};
        selecSort(arr);
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
