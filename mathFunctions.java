public class mathFunctions {
    public static void main(String[] args) {
        System.out.println("Math Functions Example");

        // Example of using a math function
        double result = Math.sqrt(16);
        System.out.println("The square root of 16 is: " + result);

        // Another example
        double powerResult = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3 is: " + powerResult);

        System.out.println(Math.max(05,7)+"\n");
        System.out.println(Math.min(05,7)+"\n");
        System.out.println(Math.abs(-7)+"\n");
        System.out.println("Randomized num :" + Math.random() + "\n");
        int random0to100 = (int) (Math.random() * 101);
        System.out.println("Random number between 0 and 100: " + random0to100);
    }
    
}
