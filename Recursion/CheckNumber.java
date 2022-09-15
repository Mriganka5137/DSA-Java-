public class CheckNumber {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9};
        System.out.println(checkNumber2(arr,0, 5));
        System.out.println(checkNumber(arr,52));

    }

    public static boolean checkNumber2(int[] arr, int si, int x) {
        if(si == arr.length){
            return false;
        }

        if(arr[si] == x){
            return true;
        }

        return checkNumber2(arr,si+1, x);
    }

    public static boolean checkNumber(int[] arr, int x) {
        if(arr.length == 0){
            return false;
        }

        if(arr[0] == x){
            return true;
        }

        int [] smallArray = new int[arr.length -1];
        for(int i=1; i<arr.length; i++){
            smallArray[i-1] = arr[i];
        }

        return checkNumber(smallArray, x);
    }
}
