public class SwapAlternate {

    public static void SwapArr(int[] arr) {
        int n=arr.length;
        // if(n%2!=0){
        //     n=n-1;
        // }
        for(int i = 0; i < n - 1; i = i + 2){
            int temp=arr[i];
            arr[i]=arr[i + 1];
            arr[i + 1]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int [] arr={9,3,6,12,4,32,3};
        SwapArr(arr);
    }
    
}
