

public class variable {
    public static void main(String[] args) {
        int myNumber = 5;//store whole numbers from -2147483648 to 2147483647
        String myString = "Hello";
        boolean myBoolean = true;
        float myFloat = 3.14f;
        char Char = 'H';
        double myDouble = 2.71828;
        long myLong = 123456789L;// store whole numbers from -9223372036854775808 to 9223372036854775807
        short myShort = 1000;//store whole numbers from -32768 to 32767
        byte myByte = 127;// -128 and 127
        System.out.println("Float: " + myFloat);
        System.out.println("Char: " + Char);
        System.out.println("Double: " + myDouble);
        System.out.println("Long: " + myLong);
        System.out.println("Short: " + myShort);
        System.out.println("Byte: " + myByte);
        System.out.println("Number: " + myNumber);
        System.out.println("String: " + myString);
        System.out.println("Boolean: " + myBoolean);

        float x = 3e2f;// 3 * 10^2
        double y = 2e4d;// 2 * 10^4
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}