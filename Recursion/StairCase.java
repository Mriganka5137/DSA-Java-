public class StairCase {
    public static void main(String[] args) {
        System.out.println(staircase(5));
    }

    public static int staircase(int n) {
        if(n == 1){
            return 1;
        }

        if(n ==2 ){
            return 2;
        }

        if (n == 3){
            return 4;
        }

        int onestep = staircase(n-1);
        int twostep = staircase(n-2);
        int threestep =  staircase(n-3);
        return onestep + twostep + threestep;
    }
}
