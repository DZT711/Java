package JavaFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CreateAndDeleteFolder {
    public static void main(String[] args) {
        try{

            File f = new File("D:\\\\Projects\\\\Java\\\\JavaFile\\\\mytestfolder");
            if(!f.exists()){ 

                System.out.println(f.mkdir()+"Folder created");
            }else{
                System.out.println("Folder not created/ Folder already exists"); 
                f.delete();
                System.out.println("Folder deleted");  
            }
        }
        catch(Exception e){
            System.out.println(e);

        }

    }
}
