public class PairSum {
    public static int SumPair(int arr[], int x) {
        int count=0;
        int l=arr.length;
        for(int i = 0; i < l-1; i++){
            for(int j = i+1; j < l; j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr={1, 3, 6, 2, 5, 4, 3, 2, 4};
        int x=7;
        int pairs=SumPair(arr,x);
        System.out.println(pairs);
    }
    
}
