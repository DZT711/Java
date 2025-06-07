import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        short age = scanner.nextShort();
        System.out.print("Are you gay (true/false)? ");
        boolean isGay = scanner.nextBoolean();
        System.out.print("Enter your bit number: ");
        int bitNum = scanner.nextInt();
        System.out.print("Enter your double num: ");
        double doubleNum = scanner.nextDouble();
        System.out.print("Enter your float num: ");
        float floatNum = scanner.nextFloat();
        System.out.print("Enter your balance: ");
        long balance = scanner.nextLong();
        System.out.print("Enter your favorite integer num: ");
        int favoriteInt = scanner.nextInt();
        System.out.print("Your name: " + name);
        System.out.print("Your age: " + age);
        switch(isGay) {
            case true -> System.out.print("You are gay.");
            case false -> System.out.print("You aren't gay.");
        }
        System.out.print(doubleNum + "Your double num: ");
        System.out.print("Your bit number: " + bitNum);
        System.out.print("Your double num: " + doubleNum);
        System.out.print("Your float num: " + floatNum);
        System.out.print("Your balance: " + balance);
        System.out.print("Your favorite integer num: " + favoriteInt);
    }
}
