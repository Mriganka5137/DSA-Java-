public class UniqueElement {
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,3,1,2};
        System.out.println(uniqueEl(arr));
    }

    public static int uniqueEl(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }

        MergeSort(arr);
        for(int i=0; i<arr.length-1;i+=2){
            if (arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
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
