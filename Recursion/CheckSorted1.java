public class CheckSorted1 {
    public static boolean checkSorted(int[] arr){
        if(arr.length == 1){
            return true;
        }

        if(arr[0] > arr[1]){
            return false;
        }

        int smallArr[] = new int[arr.length -1];
        for(int i = 1; i < arr.length; i++){
            smallArr[i-1] = arr[i];
        }

        boolean output = checkSorted(smallArr);
        return output;

    }
    public static void main(String[] args) {
        int arr[]={1,3,5,10,7,9};
        System.out.println(checkSorted2(arr,0));
        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted2(int [] arr, int si) {
        if(si == arr.length-1){
            return true;
        }

        if(arr[si] > arr[si+1]){
            return false;
        }

        return checkSorted2(arr, si+1);
    }
    
}
