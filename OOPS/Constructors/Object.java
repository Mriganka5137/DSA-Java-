
public class Object {
    public static void main(String[] args) {
        Student s1 = new Student("Mriganka", 5137);
        s1.print();
        Student s2 = new Student("Protikhya");
        s2.print();
        Student s3 = new Student();
        s3.print();

        Final f1 = new Final("Mriganka", 5137);
        System.out.println(f1.Roll_no);
        f1.name = "Protikhya";
        System.out.println(f1.name);

    }
    
}
