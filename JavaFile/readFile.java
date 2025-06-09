package JavaFile;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class readFile {
    public static void main(String[] args) {
            
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred."); 
            e.printStackTrace();
        }
    }
}
