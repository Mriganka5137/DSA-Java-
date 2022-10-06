public class Unique {
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,3,1,2};
        System.out.println(unique(arr));
    }

    public static int unique(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }

        int ele = 0;
        for(int i=0; i< arr.length; i++){
            ele = ele ^ arr[i];
        }
        return ele;
        
    }
}
