public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(tripletSum(arr,12));
    }

    public static int tripletSum(int[] arr,int num) {
        int triplets = 0;
        MergeSort(arr);
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            triplets += pairSum(arr,i+1,n-1,num-arr[i]);
        }
        return triplets;
    }

    public static int pairSum(int[] arr,int start, int end, int target) {
        int pairs = 0;
        int i = start;
        int j = end;
        while(i<j){
            if(arr[i] + arr[j] < target){
                i++;
            }

            else if(arr[i] + arr[j] > target){
                j--;
            }

            else{
                int startIndex = i;
                int startEle = arr[startIndex];
                while(i<j && arr[i] == startEle){
                    i++;
                }

                int endIndex = j;
                int endEle = arr[endIndex];
                while(j>=i && arr[j] == endEle){
                    j--;
                }

                if(arr[startIndex] == arr[endIndex]){
                    int count = (i - startIndex)+(endIndex - j)-1;
                    pairs+=(count*(count+1))/2;
                }

                else{
                    pairs+= (i - startIndex)* (endIndex - j);
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
