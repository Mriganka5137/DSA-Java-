import java.util.*;
public class ReverseString {


    public static String reverse(String str) {
        String rev = "";
        for(int i=0; i< str.length(); i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverse(str));
    }
    
}
