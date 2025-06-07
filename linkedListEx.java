import java.util.LinkedList;
import java.util.Collections;
public class linkedListEx {
    // A LinkedList is a data structure that consists of nodes, where each node contains data and a reference to the next node.
    // It allows for efficient insertion and deletion of elements.
    // A LinkedList works like an ArrayList, but it stores elements in a chain.

    // It's good when you need to add or remove items often.
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Bike");
        list.add("Car");
        list.add("Motorbike");
        System.out.println(list);

        for (String item : list) {
            System.out.println(item); // Printing each item in the list
        } 
        list.addFirst("Bus"); // Adds "Bus" at the beginning of the list
        list.addLast("Truck"); // Adds "Truck" at the end of the list
        System.out.println(list);
        list.remove("Car"); // Removes "Car" from the list
        System.out.println(list);
        list.removeFirst(); // Removes the first element ("Bus")
        System.out.println(list);
        list.removeLast(); // Removes the last element ("Truck")
        System.out.println(list);
        System.out.println("Size of the list: " + list.size()); // Prints the size of the list
        System.out.println("Is the list empty? " + list.isEmpty()); // Checks if the list is empty
        System.out.println("First element: " + list.getFirst()); // Gets the first element of the list
        System.out.println("Last element: " + list.getLast()); // Gets the last element of the list
        list.set(0, "Van");
        System.out.println("After updating first element: " + list); // Updates the first element to "Van"
        Collections.sort(list); // Sorts the list
        System.out.println("Sorted list: " + list); // Prints the sorted list
        list.clear(); // Clears the list
        System.out.println("List after clearing: " + list); // Prints the list after clearing it
    }
    
}
