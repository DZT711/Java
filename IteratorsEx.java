import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
// public class IteratorsEx {
//     public static void main(String[] args) {
//         // An Iterator is an object that allows you to traverse a collection, like an ArrayList, one element at a time.
//         // It provides methods to check if there are more elements and to get the next element.

//         ArrayList<String> list = new ArrayList<>();
//         list.add("Bike");
//         list.add("Car");
//         list.add("Motorbike");

//         // Create an iterator for the list
//         Iterator<String> iterator = list.iterator();

//         // Use the iterator to go through the elements
//         while (iterator.hasNext()) {
//             String item = iterator.next();
//             System.out.println(item);
//         }

//         System.out.print(iterator.next());

//         while (iterator.hasNext()) {//neu gia tri ke tiep ton tai
//             String item = iterator.next();
//             System.out.println(item);
//         }

//         while (iterator.hasNext() && iterator.next().equals("Bike")) {//neu gia tri ke tiep ton tai va bang "Bike"
//             String item = iterator.next();
//             System.out.println(item);

//             iterator.remove();
//             System.out.println("After removing 'Bike': " + list);
//         }
//          // Method 1: Using ListIterator (Preferred for ArrayList)
//         ListIterator<String> listIterator = list.listIterator(); 
//         while (listIterator.hasNext()) {
//             String item = listIterator.next();
//             if (item.equals("Bike")) {
//                 listIterator.set("Bus");  // Replace current element
//             }
//         }
//         System.out.println("After changing 'Bike' to 'Bus': " + list);


//          // Method 2: Using Iterator with set() method
//          Iterator<String> it = list.iterator();
//          while (it.hasNext()) { 
//              String item = it.next();
//              if (item.equals("Car")) {
//                  ((ListIterator<String>) it).set("Taxi");  // Need to cast to ListIterator
//              }
//          }
//          System.out.println("After changing 'Car' to 'Taxi': " + list);
     
//     }
    
// }
public class IteratorsEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bike");
        list.add("Car");
        list.add("Motorbike");
        list.add("Airplane");
        // Method 1: Basic iteration
        System.out.println("Basic iteration:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // Method 2: Modifying elements using ListIterator
        System.out.println("\nModifying elements:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String item = listIterator.next();
            if (item.equals("Bike")) {
                listIterator.set("Bus");
                System.out.println("Changed 'Bike' to 'Bus'");
            }
        }
        System.out.println("List after modification: " + list);

        // Method 3: Removing elements
        System.out.println("\nRemoving elements:");
        iterator = list.iterator(); // Get a fresh iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Car")) {
                iterator.remove();
                System.out.println("Removed 'Car'");
            }
        }
        System.out.println("List after removal: " + list);

                // Method 1: Using Collections.sort() before iteration
                System.out.println("Before sorting:");
                System.out.println(list);
        
                Collections.sort(list); // Sort the list
                
                System.out.println("\nAfter sorting (ascending):");
                Iterator<String> subiterator = list.iterator();
                while (subiterator.hasNext()) {
                    System.out.println(subiterator.next());
                }
        
                // Method 2: Sort in descending order
                Collections.sort(list, Collections.reverseOrder());
                
                System.out.println("\nAfter sorting (descending):");
                subiterator = list.iterator(); // Get fresh iterator
                while (subiterator.hasNext()) {
                    System.out.println(subiterator.next());
                }
        
                // Method 3: Custom sorting (by length)
                Collections.sort(list, (a, b) -> a.length() - b.length());
                
                System.out.println("\nAfter sorting by length:");
                subiterator = list.iterator(); // Get fresh iterator
                while (subiterator.hasNext()) {
                    System.out.println(subiterator.next());
                }
                // Method 1: Using Iterator's remove()
        System.out.println("Before clearing with Iterator:");
        System.out.println(list);
        
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove(); // Removes the last element returned by next()
        }
        System.out.println("After clearing with Iterator:");
        System.out.println(list);

        // Method 2: Using List's clear()
        list.add("Bike");
        list.add("Car");
        System.out.println("\nBefore clearing with clear():");
        System.out.println(list);
        
        list.clear(); // Clears all elements
        System.out.println("After clearing with clear():");
        System.out.println(list);

        // Method 3: Using ListIterator to remove specific elements
        list.add("Bike");
        list.add("Car");
        list.add("Motorbike");
        System.out.println("\nBefore selective removal:");
        System.out.println(list);
        
        ListIterator<String> listIterator1 = list.listIterator(); 
        while (listIterator1.hasNext()) {
            String item = listIterator1.next();
            if (item.contains("Bike")) { // Removes items containing "Bike"
                listIterator1.remove();
            }
        }
        System.out.println("After selective removal:");
        System.out.println(list);
    }
}