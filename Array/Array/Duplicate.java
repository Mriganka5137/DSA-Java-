public class Duplicate {
    public static int Duplic(int[] arr) {
        int num=0;
        int n=arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i!=j && arr[i]==arr[j]){
                    num=arr[i];
                    break;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int [] arr={0 ,7 ,2 ,5 ,4 ,1 ,1 ,3 ,6};
        int dup=Duplic(arr);
        System.out.println(dup);
    }
    
}
