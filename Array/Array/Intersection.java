public class Intersection {
    public static void intersec(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                if(arr1[i] == arr2[j]){
                    arr2[j]=-1;
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        
        }
        
    }
    public static void main(String[] args) {
        int [] arr1 = {2, 6, 8, 5, 4, 3};
        int [] arr2 = {2, 3, 4, 7};
        intersec(arr1, arr2);

    }
    
}
