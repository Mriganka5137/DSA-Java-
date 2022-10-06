public class Rotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};     
        rotate(arr,2);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int[] arr, int d) {
        int l = arr.length;
        reverse(arr,0,l-1);  // 7,6,5,4,3,2,1
        reverse(arr,0,l-d-1);    // 
        reverse(arr,l-d,l-1);
        return;

    }

    public static void reverse(int arr[], int start, int end) {
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }
}