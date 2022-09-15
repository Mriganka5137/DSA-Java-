public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(revEachWord(str));
    }
    public static String revEachWord(String str) {
        String result = "";
        int i=0;
        int start = 0;

        for(;i < str.length(); i++){
            if(str.charAt(i) == ' '){
                int end = i-1;
                String rev = "";
                for(int j = start; j <= end; j++){
                    rev=str.charAt(j) + rev;
                }
                start = i + 1;
                result+=rev + " ";
            }
        }
        int end = i-1;
        String rev = "";
            for(int j = start; j <= end; j++){
                rev=str.charAt(j) + rev;
            }
            start = i + 1;
            result+=rev + " ";
        return result;
    }
}
