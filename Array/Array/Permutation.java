public class Permutation {
    public static void main(String[] args) {
        String str1 = "aba";
        String str2 = "aba";
        System.out.println(CheckPer(str1, str2));
        
    }
    public static boolean CheckPer(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        if(l1 != l2)
            return false;
        int[] arr = new int[256];
        for(int i=0; i< l1; i++){
            int n = str1.charAt(i);
            arr[n]+=1;
        }

        for(int j=0; j<l2; j++){
            int n= str2.charAt(j);
            arr[n]-=1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
        
    }
    
}
