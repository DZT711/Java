
package JavaFile; 
import java.io.File;
import java.io.IOException;

import java.io.FileWriter;
public class createFile {
    public static void main(String[] args) {

        try{

            // File myObj = new File("test.txt");
            File myObj = new File("D:\\Projects\\Java\\JavaFile\\text.txt");

            System.out.println("Check exist:"+myObj.exists());
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                //Method write file 1
                // try ( FileWriter w = new FileWriter(myObj)) {
                //     w.write("Files in Java might be tricky, but it is fun enough!");
                // } catch (IOException e) {
                //     System.out.println("An error occurred.");
                //     e.printStackTrace();
                // }



                //method 2
                try  {
                    FileWriter w = new FileWriter("D:\\\\Projects\\\\Java\\\\JavaFile\\\\text.txt");
                    w.write("Files in Java might be tricky, but it is fun enough!");
                    w.close(); 
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                System.out.println("File size in bytes " + myObj.length());
                System.out.println("File last modified " + myObj.lastModified());
            } else {
                System.out.println("File already exists.");
                myObj.delete();
                System.out.println("File deleted.");
            }


        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();//in ra chuỗi các lời gọi hàm dẫn đến lỗi, giúp lập trình viên xác định vị trí và nguyên nhân của lỗ
        }




    }
}
