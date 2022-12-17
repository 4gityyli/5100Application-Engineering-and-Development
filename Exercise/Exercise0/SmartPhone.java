public class SmartPhone {
    public static void main(String[] args) {
      Phone phone1 = new Phone("Apple", "iPhone 12", 64, "Black", 6.1, true, "Phone 1", 1);
      Phone phone2 = new Phone("Samsung", "Galaxy S21", 128, "Gray", 6.2, true, "Phone 2", 2);
      Phone phone3 = new Phone("Google", "Pixel 4", 64, "White", 5.7, false, "Phone 3", 3);
  }
    private String brand;
    private String model;
    private int storageSize;
    private String color;
    private double screenSize;
    private boolean isWaterResistant;
    private String phoneName;
    private int phoneId;
    
    public SmartPhone(String brand, String model, int storageSize, String color, double screenSize, boolean isWaterResistant, String phoneName, int phoneId) {
      this.brand = brand;
      this.model = model;
      this.storageSize = storageSize;
      this.color = color;
      this.screenSize = screenSize;
      this.isWaterResistant = isWaterResistant;
      this.phoneName = phoneName;
      this.phoneId = phoneId;
      System.out.println("Phone instance created with name: " + phoneName + " and ID: " + phoneId);
    }
    
    public void makeCall() {
      System.out.println("Making call...");
    }
    
    public void sendText() {
      System.out.println("Sending text message...");
    }
    
    public void openApp() {
      System.out.println("Opening app...");
    }

  
  }
  

