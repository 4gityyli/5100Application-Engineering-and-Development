public class Car {
    private String make;
    private String model;
    private int numDoors;
    private boolean isManual;
    private String carName;
    private int year;
    private String color;
    private double engineSize;

    public static void main(String[] args) {
      Car car = new Car("Toyota", "Corolla", 2020, "Black", 1.8, 4, false, "Car");
}
    
    public Car(String make, String model, int year, String color, double engineSize, int numDoors, boolean isManual, String carName) {
      this.make = make;
      this.model = model;
      this.isManual = isManual;
      this.carName = carName;
      this.year = year;
      this.color = color;
      this.engineSize = engineSize;
      this.numDoors = numDoors;


      System.out.println("Car instance created with name: " + carName);
    }
    
    public void startEngine() {
      System.out.println("Starting engine...");
    }
    
    public void stopEngine() {
      System.out.println("Stopping engine...");
    }
    
    public void honkHorn() {
      System.out.println("Honking horn...");
    }

  }
  

  
