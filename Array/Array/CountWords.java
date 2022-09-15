import java.util.*;
public class CountWords {

    public static int countWord(String str) {
        int count = 1;
        if(str.length() == 0){
            return 0;
        }
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = countWord(str);
        System.out.println(count);
    }
    
}
