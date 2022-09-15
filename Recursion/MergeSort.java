public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {45,1,2,47,3,31,100};
        mergeSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergeSort(int arr[]) {
        if(arr.length <= 1){
            return;
        }
        int[] arr1 = new int[arr.length/2];
        int arr2[] = new int[arr.length - arr1.length];

        for(int i=0;i<arr.length/2;i++){
            arr1[i] = arr[i];
        }
        for(int i = arr.length/2; i<arr.length;i++){
            arr2[i - arr.length/2] = arr[i];    // very important step
        }


        mergeSort(arr1);
        mergeSort(arr2);
        int i=0;
        int j=0;
        int index=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[index] = arr1[i];
                index++;
                i++;
            }
            else{
                arr[index] = arr2[j];
                index++;
                j++;
            }
        }

        while(i < arr1.length){
            arr[index] = arr1[i];
            index++;
            i++;
        }
        while(j < arr2.length){
            arr[index] = arr2[j];
            index++;
            j++;
        }

        
    }
}
