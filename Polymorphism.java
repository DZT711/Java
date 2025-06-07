public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Outputs: Bark
        myDog.eat(); 
        myCat.sound(); // Outputs: Meow
        myCat.eat(); 
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {//phuon thuc cua lop con xai chung duoc method nay neu k bi ghi de
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
@Override
void sound() {
    System.out.println("Bark");
}
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}