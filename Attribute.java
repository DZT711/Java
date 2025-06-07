public class Attribute {
     int x = 10;//default attribute, can be changed
     final int y = 20; // final attribute, cannot be changed
     public int num = 100; // public attribute, can be accessed from anywhere
     private int secret = 200; // private attribute, can only be accessed within this class
        protected int protectedNum = 300; // protected attribute, can be accessed in subclasses and same package
     static  int z = 30; // static final attribute, cannot be changed
     transient int b = 50; // transient attribute, not serialized
     volatile int c = 60; // volatile attribute, ensures visibility across threads
    public static void main(String[] args) {
        Attribute obj = new Attribute();
        System.out.println("x before: " + obj.x);
        obj.x = 7;
        System.out.println("x after changed: " + obj.x);
        System.out.println("y before: " + obj.y);
        // obj.y = 25; // Uncommenting this line would cause a compilation error because y is final
        // obj.y = 25; // This line would cause a compilation error because y is final
        // finalAttribute.z = 35; // This line would also cause a compilation error because z is static final
        System.out.println("y after: " + obj.y);
        System.out.println("public attribute: " + obj.num);
        System.out.println("private attribute: " + obj.secret); // Accessing private attribute
        System.out.println("protected attribute: " + obj.protectedNum); // Accessing protected attribute
        System.out.println("static attribute: " + z); // Accessing static attribute
        System.out.println("transient attribute: " + obj.b); // Accessing transient attribute
        System.out.println("volatile attribute: " + obj.c); // Accessing volatile attribute
    }
}
