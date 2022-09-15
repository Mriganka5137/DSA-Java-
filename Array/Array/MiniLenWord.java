public class MiniLenWord {
    public static void main(String[] args) {
        String str = "aqwdqwd abwqdqwd bkjfkljrlfjlekrf cewfwef dewfwefw ewdwqd fqsqs gefewf hwefwef iewf jewf kewfwef lwded2e a";
        
        System.out.println(minLengthWord(str));
    }

    public static String minLengthWord(String str) {
        int currentStart=0;
        int minLength = Integer.MAX_VALUE;
        int minStart=-1;
        int i=0;
        for(;i < str.length();i++){
            if(str.charAt(i) == ' '){
                int currentWordLength = i - currentStart;
                if(currentWordLength < minLength){
                    minLength = currentWordLength;
                    minStart = currentStart; 
                }
                currentStart=i+1;
            }
        }
        if (minStart == -1){
            return str;
        }
        else{
            int currentWordLength = i - currentStart;
            if(currentWordLength < minLength){
                minLength = currentWordLength;
                minStart = currentStart;
            }
            return str.substring(minStart, minStart + minLength);
        }
    
    }
}
