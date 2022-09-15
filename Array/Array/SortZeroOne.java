public class SortZeroOne {

    public static int[] sortZero(int[] arr) {
        int l= arr.length;
        int nextZero=0;
        for(int i = 0;i < l; i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }
        }
        return arr;
        
    }

    public static void main(String[] args) {
        int[] arr= {0,1,1,0,1,0,1};
        arr=sortZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
