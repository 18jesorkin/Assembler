package homework4;
import java.io.File;
import java.io.IOException;
public class file {
     public static void main(String[] args) {
        File file = new File("intermediate.txt");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
