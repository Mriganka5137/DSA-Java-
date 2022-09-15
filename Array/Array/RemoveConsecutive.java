public class RemoveConsecutive {
    public static void main(String[] args) {
        String str = "aaaa";
        str= remCon(str);
        System.out.println(str);
    }

    public static String remCon(String str) {
        String result = "";
        char prev = str.charAt(0);
        result+=prev;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != prev){
                result+=str.charAt(i);
                prev = str.charAt(i);
            }
        }
        return result; 
        
    }
    
}
