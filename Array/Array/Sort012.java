public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2};
        int n= arr.length;
        int nz=0;
        int nt=n-1;
        int i=0;
        while(i <= nt){
            if(arr[i] == 0){
                arr[i] = arr[nz];
                arr[nz] = 0;
                i++;
                nz++; 
            }
            else if(arr[i] == 2){
                arr[i] = arr[nt];
                arr[nt] = 2;
                nt--;
            }
            else{
                i++;
            }

        }
        for (int j =0; j< n; j++){
            System.out.print(arr[j] + " ");
        }
    }
    
}
