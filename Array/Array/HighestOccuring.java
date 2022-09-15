public class HighestOccuring {
    public static void main(String[] args) {
        String str = "aaaabbbbbb";
        System.out.println(Highestchar(str));
    }
    public static char Highestchar(String str) {
        int[] arr = new int[256];
        int max = 0;
        for(int i=0; i<str.length(); i++){
            //int n = str.charAt(i);
            //arr[n]+=1;
            //or
            arr[str.charAt(i)]++; // incrementing directly in the array
            max = Math.max(max, arr[str.charAt(i)]); // calculating the max
        }
        char answer = '\0';
        // here we are checking from the start of the string which string = max value comes first
        for(int j=0; j< str.length(); j++){
            if(arr[str.charAt(j)] == max){
                answer = str.charAt(j);
                break;
            }
        }

        // max index is not the first that may have come in the string
        return answer;

        
    }
}
