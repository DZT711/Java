public class abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog
        dog.eat();   // Calls the inherited method from Animal
    }
}
abstract class Animal {
    abstract void sound(); // Abstract method
    void eat() { // Concrete method
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
