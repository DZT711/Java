package JavaKeyWords;

public class superEx {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
    
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    public void sound() {
        super.sound();//thuc thi phuong thuc cua lop cha 
        System.out.println("Dog barks");
    }
}