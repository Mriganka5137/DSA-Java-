public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,11,14};
        int[] arr2 = {1,2,5,13};
        
        int[] arr = merge(arr1,arr2);
        for(int i=0; i < 9; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length+arr2.length];
        int i = 0,j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else{   
                arr[k] = arr2[j];
                j++;
                k++;

            }
        }
        if(i == arr1.length){
            for(int l=j; l<arr2.length;l++){
                arr[k]=arr2[l];
                k++;
            }
        }
        else{
            for(int l=i; l<arr1.length;l++){
                arr[k]=arr1[l];
                k++;
            }

        }
        return arr;
        
    }
    
}
