public class Leaders {
    public static void main(String[] args) {
        int[] arr = {3,12,34,2,0,-1};
        leaders(arr);
    }

    public static void leaders(int[] arr) {

        for (int i = 0; i <arr.length; i++){
            boolean flag=true;
            for(int j = i+1; j<arr.length; j++){
                if ( arr[i] < arr[j] ){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
