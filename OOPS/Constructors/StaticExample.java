public class StaticExample {
    
    String name;
    int Roll_no;
    double cgpa;
    public static final double CONVERSION_FORMULA = 9.5;
    private static int count;
    

    StaticExample(String name, int Roll_no, int cgpa){
        this.name = name;
        count++;
        this.Roll_no = count;
        this.cgpa = cgpa * CONVERSION_FORMULA;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(count);
        StaticExample s1 = new StaticExample("Mriganka ", 5137, 10);
        System.out.println(s1.Roll_no);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
        System.out.println(count);
        System.out.println(CONVERSION_FORMULA);
        StaticExample s2 = new StaticExample("Mriganka ", 5137, 10);
        System.out.println(StaticExample.count);
    }
}
