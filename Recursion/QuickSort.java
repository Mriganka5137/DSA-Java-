public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {13,4,2,4,25,7,9};
        quickSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }

    private static void quickSort(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }

        int PIndex = Partition(arr,si,ei);
        quickSort(arr,si, PIndex-1);
        quickSort(arr, PIndex+1, ei);

    }

    private static int Partition(int[] arr,int si, int ei) {
        int pindex = si;
        int pElement = arr[pindex];
        int count=0;
        for(int i=si+1; i<=ei; i++){
            if(arr[i] < arr[pindex]){
                count++;
            }
        }
        int temp= arr[pindex];
        arr[pindex] = arr[pindex+count];
        arr[pindex + count] = temp;
        int i=si;
        int j =ei;
        while(i <j){
            if(arr[i] < pElement){
                i++;
            }
            else if(arr[j] >= pElement  ){
                j--;
            }

            else{
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }

        return pindex + count;
        
    }
}
