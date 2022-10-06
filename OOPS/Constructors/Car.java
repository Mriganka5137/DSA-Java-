public class Car extends Vehicle implements CarInterface, VehicleInterface {
  String brand;
  int make;

  public Car(String brand) {
    super(200);
    this.brand = brand;
    System.out.println("I am inside Car and I am not the boss");
  }

  public boolean isMotorized() {
    return true;
  }

  @Override
  public String getGears() {
    return null;
  }

  @Override
  public String getCompany() {
    // TODO Auto-generated method stub
    // System.out.println(PI);     PI value is ambigous as it is present in both the interfaces
    return null;
  }

  @Override
  public String getBrand() {
    // TODO Auto-generated method stub
    return null;
  }
}
