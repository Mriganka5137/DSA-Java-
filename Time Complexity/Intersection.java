class Intersection{
    public static void main(String[] args) {
        int[] arr1 = {5,1,6,7,9,1};
        int [] arr2 = {1,5,9};
        intersection(arr1, arr2);
    }

    public static void intersection(int[] arr1, int[] arr2) {
        MergeSort(arr1);
        MergeSort(arr2);
        int i = 0;
        int j =0;
        while(i < arr1.length &&  j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }

            else{
                j++;
            }
        }

    }

    public static void MergeSort(int[] arr) {
        if (arr.length <= 1){
            return;
        }
        int mid = arr.length/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - arr1.length];
        for(int i=0; i<mid; i++){
            arr1[i] = arr[i];
        }

        for(int i = mid; i<arr.length; i++){
            arr2[i - mid] = arr[i];
        }

        MergeSort(arr1);
        MergeSort(arr2);

        int i=0,j=0,index=0;
        while(i<arr1.length && j<arr2.length){
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
