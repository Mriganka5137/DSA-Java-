public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("aaaaababb"));
    }

    public static String removeDuplicate(String s) {
        if(s.length() <= 1){
            return s;
        }

        String small = removeDuplicate(s.substring(1));
        if(s.charAt(0) == small.charAt(0)){
            return small;
        }
        else{
            return s.charAt(0) + small;
        }

        
    }
}
