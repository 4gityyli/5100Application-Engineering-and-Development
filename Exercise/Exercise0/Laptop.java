public class Laptop {
    public static void main(String[] args){}
    private String brand;
    private String model;
    private double screenSize;
    private boolean isLaptop;
    private String computerName;
    private int computerId;
    private int storage;
    private String processor;

    
    public Computer(String brand, String model, int storage, String processor, double screenSize, boolean isLaptop, String computerName, int computerId) {
      this.brand = brand;
      this.model = model;
      this.processor = processor;
      this.screenSize = screenSize;
      this.isLaptop = isLaptop;
      this.computerName = computerName;
      this.computerId = computerId;
      this.storage = storage;

      System.out.println("Computer instance created with name: " + computerName + " and ID: " + computerId);
    }
    
    public void turnOn() {
      System.out.println("Turning on computer...");
    }
    
    public void use() {
      System.out.println("Using computer...");
    }
    
    public void turnOff() {
      System.out.println("Turning off computer...");
    }

  }
  
