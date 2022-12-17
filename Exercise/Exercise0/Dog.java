public class Dog {

    // Properties
    private String breed;
    private int age;
    private String name;
    private String ownerName;
    private boolean isTrained;
    private String favoriteToy;
    private String favoriteFood;
    private int dogId;
    
    // Constructor
    public Dog(String breed, int age, String name, String ownerName, boolean isTrained, String favoriteToy, String favoriteFood, int dogId) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.ownerName = ownerName;
        this.isTrained = isTrained;
        this.favoriteToy = favoriteToy;
        this.favoriteFood = favoriteFood;
        this.dogId = dogId;
        System.out.println("Dog instance created with name: " + name + " and ID: " + dogId);
    }
    
    // Methods
    public void bark() {
        System.out.println("Barking...");
    }
    
    public void fetch() {
        System.out.println("Fetching toy...");
    }
    
    public void eat() {
        System.out.println("Eating food...");
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador Retriever", 3, "Max", "John", true, "Stuffed Animal", "Kibble", 1);
        Dog dog2 = new Dog("German Shepherd", 5, "Bella", "Jessica", true, "Squeaky Bone", "Canned Food", 2);
        Dog dog3 = new Dog("Poodle", 1, "Charlie", "Sarah", false, "Tennis Ball", "Cooked Chicken", 3);
        }
    }

    // Main method
 

        

