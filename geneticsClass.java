public class geneticsClass {
    public static void main(String[] args) {

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());
    
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());
    }
}

class Box<T> {
    T value; // T is a placeholder for any data type
    void set(T value) {
        this.value = value;
      }
    
      T get() {
        return value;
      }
} 
 class GenericMethod {
    // Generic method: works with any type T
    public static <T> void printArray(T[] array) {
      for (T item : array) {
        System.out.println(item);
      }
    }
  
    public static void main(String[] args) {
      // Array of Strings
      String[] names = {"Jenny", "Liam"};
  
      // Array of Integers
      Integer[] numbers = {1, 2, 3};
  
      // Call the generic method with both arrays
      printArray(names);
      printArray(numbers);
    }
  }
  class Stats<T extends Number> {//use the extends keyword to limit the types a generic class or method can accept.
    //Restricts T to only work with numeric types like Integer, Double, or Float.
    T[] nums;
  
    // Constructor
    Stats(T[] nums) {
      this.nums = nums;
    }
  
    // Calculate average
    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    
  }
  
   class BoundedTypes {
    public static void main(String[] args) {
      // Use with Integer
      Integer[] intNums = {10, 20, 30, 40};
      Stats<Integer> intStats = new Stats<>(intNums);
      System.out.println("Integer average: " + intStats.average());
  
      // Use with Double
      Double[] doubleNums = {1.5, 2.5, 3.5};
      Stats<Double> doubleStats = new Stats<>(doubleNums);
      System.out.println("Double average: " + doubleStats.average());
    }
  }