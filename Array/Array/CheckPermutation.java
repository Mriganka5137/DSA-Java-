public class CheckPermutation {

        public static void main(String[] args) {
            String str1 = "abcd";
            String str2 = "";
            System.out.println(checkPermutation(str1,str2));
        }

        public static Boolean checkPermutation(String str1, String str2) {
            int l1 = str1.length();
            int l2 = str2.length();
            if(l1 != l2)
                return false;
            
            str1 = SortString(str1);
            str2 = SortString(str2);
            int i = 0;
            while(i < l1){
                if(str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
                i++;

            }
            return true;

           
        }


        public static String SortString(String str) {
            int len = str.length();
            char[] strArray = str.toCharArray();
            for(int i=0; i < len-1; i++){
                for(int j=i+1; j < len; j++){
                    if(strArray[i] > strArray[j]){
                        char temp = strArray[i];
                        strArray[i] = strArray[j];
                        strArray[j] = temp;
                    }  
                }
            }
            str = String.valueOf(strArray);
            return str;
            
        }
    }
    
