public class PrintNnatural {
    public static void main(String[] args) {
        print(24);
    }

    private static void print(int i) {
        if (i == 0){
            return;
        }
        print(i-1);
        System.out.println(i);
    }
    
}
