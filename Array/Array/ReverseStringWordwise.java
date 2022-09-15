public class ReverseStringWordwise {
    public static void main(String[] args) {
        String str = "Coding Ninjas are The Best";
        System.out.println(reverseWordWise(str));
    }

    public static String reverseWordWise(String str) {
        String result="";
        int start = 0;
        int i=0;
        String rev="";
        for(; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                rev = str.substring(start, i);
                result =  rev + " "+ result+ " ";
                start = i + 1;
            }
        }
        rev = str.substring(start, i);
        result = rev +" "+ result + " ";



        return result;
    }
    
}
