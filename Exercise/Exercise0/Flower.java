public class Flower {
    private String name;
    private String species;
    private String type;
    private String soilType;
    private boolean isPotted;
    private int waterFrequency;
    private double height;
    private int plantId;
    public static void main(String[] args) {
      Flower plant1 = new Flower("Rose", "Rosa", "Flowering", "Loamy", true, 2, 1.5, 1);

  }

    public Flower(String name, String species, String type, String soilType, boolean isPotted, int waterFrequency, double height, int plantId) {
      this.name = name;
      this.species = species;
      this.type = type;
      this.soilType = soilType;
      this.isPotted = isPotted;
      this.waterFrequency = waterFrequency;
      this.height = height;
      this.plantId = plantId;
      System.out.println("Plant instance created with name: " + name + " and ID: " + plantId);
    }
    
    public void water() {
      System.out.println("Watering plant...");
    }
    
    public void prune() {
      System.out.println("Pruning plant...");
    }
    
    public void fertilize() {
      System.out.println("Fertilizing plant...");
    }

  
  }
  
