public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "aaaaaa";
        char x = 'b';
        System.out.println(RemoveChar(str,x));
    }

    public static String RemoveChar(String str, char x) {

        String result = "";
        int count=0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) != x){
                result+=str.charAt(i);
            }
            else{
                count++;
            }
        }
        if(count == str.length()){
            return result;
        }
        else if(count == 0){
            return str;
        }
        else{
            return result;
        }



       
    }
    
}
