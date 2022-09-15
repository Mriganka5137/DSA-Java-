public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simlify();
    }

    private void simlify(){
        int gcd = 1;
        int smaller = Integer.min(numerator, denominator);
        for(int i=2; i <= smaller; i++){
            if(numerator%i == 0 && denominator%1 == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public void print() {
        System.out.println(numerator + "/"+ denominator);
        
    }

    public void increment(){
        numerator = numerator + denominator;
        print();
    }

    // object method
    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
        this.denominator = this.denominator * f2.denominator;
        simlify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
        
    }

}
