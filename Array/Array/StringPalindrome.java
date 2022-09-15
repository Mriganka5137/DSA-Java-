import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();
        System.out.println(palindrome(input));
    }


    public static boolean palindrome(String input) {
        int start = 0;
        int end = input.length()-1;
        while(start <= end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
