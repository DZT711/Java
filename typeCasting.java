public class typeCasting {
    public static void main(String[] args) {
        int myInt = 100;
        double myDouble = myInt; // Implicit casting (int to double)
        System.out.println("Implicit casting (int to double): " + myDouble);

        double anotherDouble = 9.78;
        int myNewInt = (int) anotherDouble; // Explicit casting (double to int)
        System.out.println("Explicit casting (double to int): " + myNewInt);

        // Example of narrowing conversion
        long myLong = 100000L;
        int myNarrowedInt = (int) myLong; // Explicit casting (long to int)
        System.out.println("Narrowing conversion (long to int): " + myNarrowedInt);
    }
}