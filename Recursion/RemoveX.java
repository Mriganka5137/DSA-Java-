public class RemoveX {
    public static void main(String[] args) {
        System.out.println(removeX("codingninjas"));
    }

    public static String removeX(String s) {
        if(s.length() == 0){
            return s;
        }

        String output = removeX(s.substring(1));
        if(s.charAt(0) == 'i'){
            return output;
        }
        else{
            return s.charAt(0) + output;
        }
        
    }
}
