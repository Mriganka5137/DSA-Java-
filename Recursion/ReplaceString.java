public class ReplaceString {
    public static void main(String[] args) {
        System.out.println(replaceString("codinginjas", 'i', 'a'));
    }

    public static String replaceString(String s, char a, char b) {
        if(s.length() == 0){
            return s;
        }

        String output = replaceString(s.substring(1), a, b);
        if(s.charAt(0) == a){
            return b + output;
        }
        else{
            return s.charAt(0) + output;
        }
        
    }
}
