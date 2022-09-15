public class LastIndex {
    public static void main(String[] args) {
        int [] arr = {9,8,10,8,8};
        int index = lastIndex(arr,8);
        int index2 = lastIndexBetter(arr, 10, 0);
        System.out.println(index);
        System.out.println(index2);
    }

    public static int lastIndexBetter(int[] arr, int num, int si) {
        if(si == arr.length){
            return -1;
        }

        int k = lastIndexBetter(arr, num, si + 1);
        if(k != -1){
            return k;
        }
        else{
            if(arr[si] == num){
                return si;
            }
            else{
                return -1;
            }
        }
    }


    public static int lastIndex(int[] arr, int num) {
        int length = arr.length;
        if (length == 0){
            return -1;
        }

        int [] smallArray = new int[arr.length - 1];
        for(int i=1; i< length; i++){
            smallArray[i-1] = arr[i];
        }

        int smallOutput = lastIndex(smallArray, num);
        if (smallOutput < 0){
            if(arr[0] == num){
                return 0;
            }
            else{
                return smallOutput;
            }
        }
        else{
            return 1 + smallOutput;
        }
    }
}
