public class ArrayRotationCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int k = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                k = i+1;
                break;
            }
        }
        System.out.println(k); 
    }
    
}
