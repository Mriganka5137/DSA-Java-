public class CheckAB {
    public static void main(String[] args) {
        System.out.println(chechAB("abb"));
    }

    public static boolean chechAB(String s) {
        if(s.length() == 0){
            return true;
        }

        if(s.charAt(0) == 'a'){
            if(s.substring(1).length() >1 && s.substring(1, 3).equals("bb")){
                return chechAB(s.substring(3));
            }
            else{
                return chechAB(s.substring(1));
            }   
        } 
    
         return false;

        
    }
}
