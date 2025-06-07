public class getAndSet {
    private int value; // Private attribute

    // Getter method for value
    public int getValue() {
        return value;
    }

    // Setter method for value
    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        getAndSet obj = new getAndSet();
        obj.getValue(); // Getting value using getter
        System.out.println("Initial Value: " + obj.getValue()); // Should print 0 as default value
        obj.setValue(10); // Setting value using setter
        System.out.println("Value: " + obj.getValue()); // Getting value using getter
    }
    
}
