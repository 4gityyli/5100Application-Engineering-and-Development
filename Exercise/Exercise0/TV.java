public class TV {
    
        private String brand;
        private String model;
        private double screenSize;
        private String resolution;
        private boolean isSmart;
        private String remoteType;
        private String tvName;
        private int tvId;
        public static void main(String[] args) {
          TV tv1 = new TV("Sony", "Bravia", 65, "4K", true, "Bluetooth", "TV 1", 1);
  
        }
        
        public TV(String brand, String model, double screenSize, String resolution, boolean isSmart, String remoteType, String tvName, int tvId) {
          this.brand = brand;
          this.model = model;
          this.screenSize = screenSize;
          this.resolution = resolution;
          this.isSmart = isSmart;
          this.remoteType = remoteType;
          this.tvName = tvName;
          this.tvId = tvId;
          System.out.println("Television instance created with name: " + tvName + " and ID: " + tvId);
        }
        
        public void turnOn() {
          System.out.println("Turning on television...");
        }
        
        public void changeChannel() {
          System.out.println("Changing channel...");
        }
        
        public void turnOff() {
          System.out.println("Turning off television...");
        }

      }
      

      

