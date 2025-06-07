import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;

public class hashSet {
    public static void main(String[] args) {
        // A HashSet is a data structure that stores unique elements.
        // It does not allow duplicate values and is useful for checking membership quickly.
        // It's good when you need to ensure that all items are unique and you want fast lookups.

        HashSet<String> set = new HashSet<>();
        set.add("Bike");
        set.add("Car");
        set.add("Motorbike");
        set.add("Bike"); // This will not be added again, as it's a duplicate.

        System.out.println(set);

        List<String> list = new ArrayList<>(set); // Convert the set to a list
        Collections.sort(list); // Sort the list
        System.out.println("Sorted set by converted to list: " + list);

        TreeSet<String> treeSet = new TreeSet<>(set); 
        System.out.println("Sorted HashSet by converted to TreeMap: " + treeSet);

        for (String item : set) {
            System.out.println(item); // Printing each item in the set
        }


        System.out.println("Does the set contain 'Car'? " + set.contains("Car"));
        System.out.println("Size of the set: " + set.size());
        set.remove("Bike"); // Remove the item "Bike"
        System.out.println("After removing 'Bike': " + set);
        if (set.contains("Car")) {
            set.remove("Car"); // Remove "Car" if it exists
            set.add("Truck"); // Add "Truck" to the set 
            // khi them se them vao vi tri vua xoa
            System.out.println("After removing 'Car' and adding 'Truck': " + set);
        }
        set.clear(); // Clear all items in the set
        System.out.println("After clearing the set: " + set);
        System.out.println("Is the set empty? " + set.isEmpty());
    }
}
