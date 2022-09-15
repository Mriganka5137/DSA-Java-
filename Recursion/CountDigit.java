public class CountDigit {
    public static void main(String[] args) {
        System.out.println(count(05614302));
    }

    private static int count(int n) {
        if(n % 10 == n){
            return 1;
        }
        return 1 + count(n/10);
    }
}
