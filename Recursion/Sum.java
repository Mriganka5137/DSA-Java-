public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(9));
    }
    public static int sumOfDigits(int input){
        
        if(input %10 == input){
            return input;
        }

        return input % 10 + sumOfDigits(input/10); 
    }
}
