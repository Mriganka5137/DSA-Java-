public class ArraySum {
    public static void main(String[] args) {
        int [] arr = {5,5,5};
        int sum = sum(arr);
        int sum2 = sum2(arr,0);
        System.out.println(sum2);
    }

    public static int sum2(int[] arr, int si) {
        if(si == arr.length-1){
            return arr[si];
        }

        return arr[si] + sum2(arr, si+1);
    }


    public static int sum(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }

        int [] smallArray = new int[arr.length -1];
        for(int i=1; i<arr.length; i++){
            smallArray[i-1] = arr[i];
        }

        return arr[0] + sum(smallArray);
        
    }
}
