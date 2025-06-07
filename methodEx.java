import java.util.Scanner;

//lop giao dien
interface MyInterface {
    //defaut method can only be used in interface
    // Giúp mở rộng interface mà không cần thay đổi tất cả các lớp kế thừa.

    // Tránh việc phá vỡ mã nguồn cũ khi thêm phương thức mới vào interface.

    // Cho phép có logic mặc định, nhưng vẫn có thể override nếu cần.
    // mot phuong thuc k co protected,public,private thi mac dinh la default nhung k can ghi deufault
    default void sayHello() {
        System.out.println("Xin chào từ phương thức mặc định!");
    }

}
abstract class MyAbstractClass {
    // Abstract method (does not have a body)
    public abstract void myAbstractMethod();

    // Regular method
    public void myRegularMethod() {
        System.out.println("This is a regular method in an abstract class.");
    }
}


 class MethodEx extends MyAbstractClass implements MyInterface {
    // Implementing the abstract method from MyAbstractClass
    @Override
    public void myAbstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    // Method to add two integers
    public static int add(int a, int b) {// method is likes function
        return a + b;
    }

    // Method to greet a person
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static void myStaticMethod() {// Static method can be called without creating an object
        System.out.println("Static methods can be called without creating objects");
    }

    protected void myProtectedMethod() {
        System.out.println("Protected methods can be called within the same package or subclasses");
    }

    private void myPrivateMethod() {
        System.out.println("Private methods can only be called within the same class");
    }

    final void myFinalMethod() {
        System.out.println("Final methods cannot be overridden in subclasses");
    }
// transient không áp dụng cho methods, chỉ dùng cho variables
// transient dùng để đánh dấu một trường không được serialize khi lưu đối tượng


// synchronized: đảm bảo chỉ một thread có thể truy cập phương thức tại một thời điểm
synchronized void mySynchronizedMethod() {
    System.out.println("Phương thức synchronized chỉ cho phép một luồng truy cập tại một thời điểm");
}

// volatile không áp dụng cho methods, chỉ dùng cho variables
// volatile dùng để đảm bảo giá trị của biến luôn được cập nhật giữa các threads


    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instance of MethodEx
        MethodEx obj = new MethodEx();

        // Test basic methods
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        String greeting = greet("User");
        System.out.println(greeting);

        // Get user input for numbers
        System.out.print("Enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        int sum = add(num1, num2);
        System.out.println("Calculated Sum by using method: " + sum);

        // Get user input for name
        System.out.print("Enter your first name: ");
        String fn = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String ln = scanner.nextLine();
        String fullName = fullName(fn, ln);
        System.out.println("Combined Name by using method: " + fullName);

        // Test all methods
        myStaticMethod();
        obj.myProtectedMethod();
        obj.myPrivateMethod();
        obj.sayHello();
        obj.myAbstractMethod();
        obj.myRegularMethod();
obj.myFinalMethod();
obj.mySynchronizedMethod();
        scanner.close();
    }
}

