public class FirstIndex {
    public static void main(String[] args) {
        int [] arr = {5,6,7,6,9};
        System.out.println(firstIndex2(arr, 5));
        System.out.println(firstIndex(arr,67,0));
    }
    
    public static int firstIndex2(int arr[], int x) {
        if(arr.length == 0){
            return -1;
        }

        if(arr[0] == x){
            return 0;
        }

        int[] smallArray = new int[arr.length -1];
        for(int i=1; i<arr.length; i++){
            smallArray[i-1]=arr[i];
        }

        int output=firstIndex2(smallArray, x);
        if(output == -1){
            return -1;
        }
        else{
            return 1 + output; 
        }
    }
    public static int firstIndex(int arr[], int x, int si) {
        if(si == arr.length){
            return -1;
        }

        if(arr[si] == x){
            return si;
        }

        return firstIndex(arr, x, si+1);
    }

}
