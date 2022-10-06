public class PairSUm {
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,4,4,4,4};
        System.out.println(pairSum(arr,7));
    }

    public static int pairSum(int [] arr, int num) {
        int i = 0;
        int j = arr.length -1;
        int pairs = 0;
        MergeSort(arr);
        while(i < j){
            if(arr[i] + arr[j] > num){
                j--;
            }

            else if(arr[i] + arr[j] < num){
                i++;
            }

            else{
                int start = i;
                int startEle = arr[i];
                while( i < j && arr[i] == startEle){
                    i++;
                }

                int end = j;
                int endEle = arr[j];
                while( j >= i && arr[j] == endEle){
                    j--;
                }

                if(arr[start] == arr[end]){
                    int count = ((i-start)+(end - j))-1;
                    pairs+=(count*(count+1))/2;
                }

                else{
                    pairs+=((i-start)*(end-j));
                }
            }
        }
        return pairs;

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
