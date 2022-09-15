public class Car extends Vehicle{
    String brand;
    int make;

    public Car(String brand){
        super(200);
        this.brand = brand;
        System.out.println("I am inside Car and I am not the boss");

    }
}
