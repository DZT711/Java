import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car {
  public String brand;
  public String model;
  public int year;
  
  public Car(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
}

// Create a comparator
class SortByYear implements Comparator {
  public int compare(Object obj1, Object obj2) {
    // Make sure that the objects are Car objects
    Car a = (Car) obj1;
    Car b = (Car) obj2;
    
    // Compare the year of both objects
    if (a.year < b.year) return -1; // The first car has a smaller year
    if (a.year > b.year) return 1;  // The first car has a larger year
    return 0; // Both cars have the same year
  }
}

public class advancedSorting {
    public static void main(String[] args) { 
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();    
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));
        System.out.println("Car array before sorting: "); 
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
        //method 1
        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);
        
        // Display the cars
        System.out.println("Car array after sorting by year: ");
        for (Car c : myCars) {
          System.out.println(c.brand + " " + c.model + " " + c.year);
        }


        myCars.add(new Car("Vinfast", "VF9", 2020));
        myCars.add(new Car("Lamborghini", "Hurracan", 2019)); 
        System.out.println("Car array before sorting: "); 
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
        //method 2 use lambda
        Collections.sort(myCars, (obj1, obj2) -> {
          Car a = (Car) obj1;
          Car b = (Car) obj2;
          if (a.year < b.year) return -1;
          if (a.year > b.year) return 1;
          return 0;
        });
        System.out.println("Car array after sorting by year: ");
        for (Car c : myCars) {
          System.out.println(c.brand + " " + c.model + " " + c.year);
        }

      } 
}
//method 3
// Define a Car class which is comparable
class Cars implements Comparable {
  public String brand;
  public String model;
  public int year;

  public Cars(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }

  // Decide how this object compares to other objects
  public int compareTo(Object obj) {
    Cars other = (Cars) obj;
    if (year < other.year)
      return -1; // This object is smaller than the other one
    if (year > other.year)
      return 1; // This object is larger than the other one
    return 0; // Both objects are the same
  }
}
class Main { 
  public static void main(String[] args) { 
    // Create a list of cars
    ArrayList<Cars> myCars = new ArrayList<Cars>();    
    myCars.add(new Cars("BMW", "X5", 1999));
    myCars.add(new Cars("Honda", "Accord", 2006));
    myCars.add(new Cars("Ford", "Mustang", 1970)); 

    // Sort the cars
    Collections.sort(myCars);

    // Display the cars
    for (Cars c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}
