public class BinarySearch {
    public static void binarySearch(int[] arr, int a){

        int l = arr.length;
        int start=0,end=l-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid] > a){
                end=mid-1;
            }
            else if(arr[mid] < a){
                start=mid+1;
            }
            else{
                System.out.println(mid);
                return;
            }


        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,14,24,44,69};
        binarySearch(arr,28);
    }
    
}
