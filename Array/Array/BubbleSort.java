public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int count=0;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                count++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        System.out.println(count);
        
    }

    public static void main(String[] args) {
        int [] arr = {56,5,1,45,47,7,12,5,9,98,4};
        bubbleSort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
