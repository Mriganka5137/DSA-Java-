public class Substring2 {
    public static void main(String[] args) {
        String str = "abcd";
        subString(str);
    }

    public static void subString(String str) {
        int l = str.length();
        for(int len=1; len<=l; len++){
            for(int start=0; start<=l-len; start++){
                int end = start + len - 1;
                System.out.println(str.substring(start, end+1));
            }
        }
        
    }
    
}
