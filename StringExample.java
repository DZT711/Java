import java.lang.String; // Importing the String class from java.lang package

public class StringExample {
    public static void main(String[] args) {
        String myString = "Hello, World!";
        System.out.println("Original String: " + myString);

        // Length of the string
        int length = myString.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase
        String upperCaseString = myString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Convert to lowercase
        String lowerCaseString = myString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Replace a character
        String replacedString = myString.replace('o', '0');
        System.out.println("Replaced String: " + replacedString);

        // Substring
        String substring = myString.substring(0, 5);
        System.out.println("Substring (0 to 5): " + substring);
        System.out.println("Index of 'World': " + myString.indexOf("World"));

        String str1 = "Nguyen";
        String str2 = "Huy";

        System.out.println("Concatenated String: " + str1.concat(" " + str2));
        String name=str1 + " " + str2;
        System.out.println("Name: " + name);
    }
    
}
