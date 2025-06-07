public class constructors {
    // Attributes (fields)
    String name;
    int age;

    // Constructor with parameters
    public constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public constructors() {// Constructor without parameters
        // Default constructor
        this.name = "";
        this.age = 0;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the constructor
    public static void main(String[] args) {
        constructors person = new constructors("thuy an", 20);
        person.displayInfo();
        constructors defaultPerson = new constructors();
        // Using the default constructor
        defaultPerson.name = "Thu Hang"; // Setting default values
        defaultPerson.age = 20;
        defaultPerson.displayInfo();
    }

}
