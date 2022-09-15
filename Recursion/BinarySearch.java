public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,5,6,7,9,11,25};
        System.out.println(binarySearch(a,0,a.length -1,1));
    }

    public static int binarySearch(int[] arr, int si, int ei, int x) {
        if(si > ei){
            return -1;
        }

        int mid = (si + ei)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] > x){
            return binarySearch(arr, si, mid-1, x);
        }
        else{
            return binarySearch(arr, mid+1, ei, x);
        }

    }
}
