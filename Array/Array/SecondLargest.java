public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,6,18,21,4,21};
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max && arr[i] > secondMax){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
    
}
