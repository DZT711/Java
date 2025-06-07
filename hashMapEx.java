import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class hashMapEx {
    public static void main(String[] args) {
        // A HashMap is a data structure that stores key-value pairs.
        // It allows for fast retrieval of values based on their keys.
        // It's good when you need to look up items quickly by a unique identifier.
        
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Bike");
        map.put("2", "Car");
        map.put("3", "Motorbike");
        map.put("5", "Motorcycle");
        map.put("4", "Truck");
        
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key)); // Printing each key-value pair
        }
        for (String value : map.values()) {
            System.out.println("Value: " + value); // Printing each value in the map
        }
        for (String i : map.keySet()) {
            System.out.println(i); // Printing each key-value pair again
        }
        map.put("1", "Van"); // Update the value for key "1"
        System.out.println("After updating key '1': " + map);

        TreeMap<String, String> treeMap = new TreeMap<>(map); // Create a TreeMap from the HashMap
        System.out.println("HashMap sorted by key: " + treeMap);
        
        List<HashMap.Entry<String, String>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(HashMap.Entry.comparingByValue());
        System.out.println("HashMap sorted by value: " + entryList); 

        System.out.println("Value for key '2': " + map.get("2"));
        map.remove("1"); // Remove the entry with key "1"
        System.out.println("After removing key '1': " + map);
        System.out.println("Does the map contain key '3'? " + map.containsKey("3"));
        System.out.println("Does the map contain value 'Car'? " + map.containsValue("Car"));
        System.out.println("Size of the map: " + map.size());
        map.clear(); // Clear all entries in the map
        System.out.println("After clearing the map: " + map);
    }
}
