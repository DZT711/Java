public class interfaceEx {
    public static void main(String[] args) {
        // Create an instance of the class that implements the interface
        MyClass myObject = new MyClass();

        // Call the method defined in the interface
        myObject.displayMessage();
        myObject.sayHello();
    }

}

interface MyInterface {
    void displayMessage();
}
//lop ke thua 2 lop giao dien
class MyClass implements MyInterface, MySecondInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello, this is a message from the interface implementation!");
    }
    @Override
    public void sayHello() {
        System.out.println("This message is from MySecondInterface");
    }
}
interface MySecondInterface {

    void sayHello();
}
