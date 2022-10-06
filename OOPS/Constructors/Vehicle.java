public abstract class Vehicle {
  int speed;
  private String name;

  public Vehicle(int speed) {
    this.speed = speed;
    System.out.println("I am inside Vehicle and I am the boss" + this.speed);
  }

  public abstract boolean isMotorized();

  public abstract String getCompany();
}
