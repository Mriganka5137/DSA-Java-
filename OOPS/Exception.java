public class Exception {
    public static void main(String[] args){
        int a=0;
        try {
            a = divide(5,0);
            System.out.println(a);
        } catch (DivideByZeroException e) {
            System.out.println("Dividing by zero and I am handling here");
        }


    }

    private static int divide(int i, int j) throws DivideByZeroException{
        if(j == 0){
            throw new DivideByZeroException();
        } 
        return i/j;
    }

}
