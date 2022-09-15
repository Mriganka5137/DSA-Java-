public class GetCompressedString {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(compressStr(str));
    }

    public static String compressStr(String str) {

        String result = "";
        int count=0;
        for (int i=0; i<str.length(); i++){
            if(i==0){
                result+=str.charAt(i);
                count++;
            }
            else if(i!=0 && str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if (count!=1){
                result= result + count + str.charAt(i);
                count=1;}
                else{
                    result =result + str.charAt(i);
                }
            }
        }
        if (count!=1)
            return result + count;
        return result;
    }
}
