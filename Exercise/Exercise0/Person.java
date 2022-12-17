class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String occupation;
    
    // Constructor
    public Person(int id, String name, int age, String gender, String address, String phoneNumber, String email, String occupation) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.occupation = occupation;
      
      System.out.println("Creating new person with id " + id + " and name " + name);
    }
    
    // Method to get the person's name
    public String getName() {
      return this.name;
    }
    
    // Method to get the person's age
    public int getAge() {
      return this.age;
    }
    
    // Method to get the person's occupation
    public String getOccupation() {
      return this.occupation;
    }
    
    // Main method to create and print information about some Person objects
    public static void main(String[] args) {
      Person person1 = new Person(1, "John", 30, "Male", "123 Main Street", "555-555-1212", "john@example.com", "Software Engineer");
      Person person2 = new Person(2, "Jane", 25, "Female", "456 Park Avenue", "555-555-1213", "jane@example.com", "Data Scientist");
      Person person3 = new Person(3, "Bob", 35, "Male", "789 Maple Street", "555-555-1214", "bob@example.com", "Product Manager");
      
      System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Occupation: " + person1.getOccupation());
      System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Occupation: " + person2.getOccupation());
      System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Occupation: " + person3.getOccupation());
    }
  }
  