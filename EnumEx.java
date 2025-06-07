public class EnumEx {

    public enum Color {
        RED, GREEN, BLUE
    }

    public enum Variables {
        ONE(1),
        TWO(2),
        THREE(3);

        private final int value;  // The value associated with the enum constant

        // Constructor
        Variables(int value) {
            this.value = value;
        }

        // Getter method
        public int getValue() {
            return value;
        }
    }
public enum ComplexEnum {
    ENTRY1(1, "First"),
    ENTRY2(2, "Second");

    private final int id;
    private final String description;

    ComplexEnum(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
}
public enum MathOperation {
    PLUS("+") {
        @Override
        public int apply(int x, int y) { return x + y; }
    },
    MINUS("-") {
        @Override
        public int apply(int x, int y) { return x - y; }
    };

    private final String symbol;
    
    MathOperation(String symbol) {
        this.symbol = symbol;
    }

    public abstract int apply(int x, int y);
}

public static void main(String[] args) {
    System.out.println("List of Color:");
    for (Color color : Color.values()) {
        System.out.println(color);
    }
        // Example usage of the Color enum
        Color myColor = Color.RED;

        switch (myColor) {
            case RED:
                System.out.println("The color is Red.");
                break;
            case GREEN:
                System.out.println("The color is Green.");
                break;
            case BLUE:
                System.out.println("The color is Blue.");
                break;
            default:
                System.out.println("Unknown color.");
        }
        Variables var = Variables.ONE;
        System.out.println("Value of " + var + " is: " + var.getValue());  // Output: Value of ONE is: 1

        // You can iterate through all enum values
        for (Variables v : Variables.values()) {
            System.out.println(v + " has value: " + v.getValue());
        }
        MathOperation m= MathOperation.PLUS;
        System.out.println("Result of 5 + 3: " + m.apply(5, 3)); // Output: Result of 5 + 3: 8
        MathOperation n= MathOperation.MINUS;
        System.out.println("Result of 5 - 3: " + n.apply(5, 3)); // Output: Result of 5 - 3: 2
        ComplexEnum ce = ComplexEnum.ENTRY1;
        System.out.println("ComplexEnum ID: " + ce.getId() + ", Description: " + ce.getDescription());
        ComplexEnum etr2 = ComplexEnum.ENTRY1;
        System.out.println("ComplexEnum ID: " + etr2.getId() + ", Description: " + etr2.getDescription());
    }
}
