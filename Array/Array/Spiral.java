public class Spiral {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr) {
        int l = arr.length * arr[0].length;
        int count =1;
        int rs=0, re=arr.length-1, cs=0, ce=arr[0].length-1;
        while(count <= l){
            for(int j=cs; j <= ce; j++){
                System.out.print(arr[rs][j] + " ");
                count++;
            }
            rs+=1;

            for(int i = rs; i <= re; i++){
                System.out.print(arr[i][ce] + " ");
                count++;
            }
            ce-=1;

            for(int j= ce; j >=cs; j--){
                System.out.print(arr[re][j]+" ");
                count++;
            }
            re-=1;

            for(int i=re; i>=rs; i--){
                System.out.print(arr[i][cs]+" ");
                count++;
            }
            cs+=1;
        }
        
    }
    
}
