import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l+1; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
