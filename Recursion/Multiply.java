public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply(0,10));
    }

    public static int multiply(int m, int n) {
        if(n == 0 || m ==0){
            return 0;
        }

        return m + multiply(m, n-1);
        
    }
}
