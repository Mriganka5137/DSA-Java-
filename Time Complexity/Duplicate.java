public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {0,7,2,5,4,7,1,3,6};
        System.out.println(duplicate(arr));
    }

    public static int duplicate(int[] arr) {
        int n = arr.length;
        int nSum = ((n-2)*(n-1))/2;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }

        return sum - nSum;
    }
}
