public class FindUnique {

    public static int findUnique(int[] arr) {
        int unique=0;
        int n=arr.length;
        for(int i = 0; i < n; i++){
            boolean flag=true;
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    flag=false;
                    break;
                }

            }
            if(flag){
                unique=arr[i];
                break;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        int [] arr={1,3, 1, 3, 6, 6, 7, 10, 7};
        int num=findUnique(arr);
        System.out.println(num);

    }
    
}
