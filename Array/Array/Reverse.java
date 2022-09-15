public class Reverse {
    public static void main(String[] args) {
        String str = "Welcome to coding ninjas";
        System.out.println(reverse_string(str));
    }
    public static String reverse_string(String str) {
        String result = "";
        int start = 0;
        int i = 0;

        for(; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                String ulta="";
                String rev = str.substring(start, i);
                start = i+1;
                for(int j=0; j<rev.length(); j++){
                    ulta = rev.charAt(j) + ulta;
                }
                result=result +  ulta+ " ";
            }
        }
        String ulta="";
        String rev = str.substring(start, i);
        for(int j=0; j<rev.length(); j++){
            ulta = rev.charAt(j) + ulta;
        }
        result=result+ulta + " ";





        return result;
    }
    
}
