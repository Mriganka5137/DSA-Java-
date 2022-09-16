public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println(CheckPalindrome("rocecar",0,6));
    }


    public static boolean CheckPalindrome(String s, int si, int ei) {
        if(si > ei){
            return true;
        }

        if(s.charAt(si) != s.charAt(ei)){
            return false;
        }
        else{
            return CheckPalindrome(s, si+1, ei-1);
        }


    }
}
