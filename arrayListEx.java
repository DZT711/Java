import java.util.ArrayList;
import java.util.Collections;
// An ArrayList is a resizable array that can grow as needed.

// It allows you to store elements and access them by index.
public class arrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bike");
        list.add("Car");
        list.add("Motorbike");
        list.add("Bicycle");
        list.add("Truck");
        list.add("Van");

        for (String item : list) {
            System.out.println(item); // Printing each item in the list
        }
        System.out.println(list);
        System.out.println(list.size()); // Getting the size of the list
        System.out.println(list.get(0));// Accessing the first element
        System.out.println(list.set(0, "Scooter"));// Updating the first element
        System.out.println(list);
        list.remove(0); // Removing the first element
        System.out.println(list);
        Collections.sort(list); // Sorting the list
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); // Sorting the list in reverse order    
        System.out.println(list);
        list.clear(); // Clearing the list
        System.out.println(list);
        System.out.println("Is the list empty? " + list.isEmpty()); // Checking if the list is empty

    }
}
