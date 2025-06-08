import java.util.Scanner;
// The try statement allows you to define a block of code to be tested for errors while it is being executed.

// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
public class exceptions {
    public static void main(String[] args) {
    int x=1;
    int y = 0;
    int z = 1;
        try{
            System.out.println(x/y);
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        
        try {
            System.out.println(x/z);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Caculating done");
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = s.nextDouble();
        System.out.println("Enter another number to divide: ");
        double num2 = s.nextDouble();
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");// create new error when meet condition(s)
        } else {
            System.out.println(num1 / num2);
        }
    }
} 