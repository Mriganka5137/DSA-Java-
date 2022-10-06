public class EquillibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1,4,9,3,2};
        System.out.println(eqbli(arr));
    }

    public static int eqbli(int[] arr) {
        int sum = 0, leftSum = arr[0];
        for(int i=0; i< arr.length; i++){
            sum=+arr[i];
        }
        int j=1;
        int rightsum;
        while(j < arr.length){
            rightsum = sum - arr[j] - leftSum;
            if (rightsum == leftSum){
                return j;
            }
            j++;
            leftSum=+arr[j];
        }
        return -1;
    }
}
