public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int i) {
        if(i == 1 || i == 2){
            return 1;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
    
}
