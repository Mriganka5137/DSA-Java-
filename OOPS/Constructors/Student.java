public class Student {
    String name;
    private int RollNo;
    public Student(String name, int RollNo){
        this.name = name;
        this.RollNo = RollNo;
    }
    public Student(String name){
        this.name = name; 
    }

    public Student(){
        name = "abc";
        RollNo = 123;
    }

    public void print() {
        System.out.println(" Name is " + name + " Roll No is " + RollNo );
    }
    
}
