public class ReplacePi {
    public static void main(String[] args) {
        System.out.println(replacePi("Mrigankapigogoi"));
    }

    public static String replacePi(String s) {
        if(s.length() <= 1){
            return s;
        }

        if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            return "3.14" + replacePi(s.substring(2));
        }

        else{
            return s.charAt(0) + replacePi(s.substring(1));
        }
        
    }
}
