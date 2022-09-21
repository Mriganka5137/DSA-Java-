public class StringToInt {
    public static int convertStringToInt(String input){
        if(input.length() == 0){
            return 0;
        }


        int smallValue = convertStringToInt(input.substring(1));
        int digit = input.charAt(0) - '0';
        int result = digit * (int)Math.pow(10, input.length()-1);
        return result + smallValue;
    }

    public static int convertStringToInt2(String input){

        if(input.length() == 1){
            return input.charAt(0) - '0';
        }

        int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
        int digit = input.charAt(0) - '0';
        return smallOutput * 10 + digit;
    }


    public static void main(String[] args) {
        int result = convertStringToInt2("02500210");
        System.out.println(result);
    }
}
