package homework4;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class main1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("example.txt");
        FileWriter fw = new FileWriter("intermediate.txt");
        BufferedReader bufferr = new BufferedReader(fr);
        BufferedWriter bufferw = new BufferedWriter(fw);
        if (args.length > 0) {
            File file = new File(args[0]); // args[0] is the first command-line argument

            try {
                // Read the file line by line
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.err.println("Please provide a file name as a command-line argument.");
        }
        bufferr.close();
        bufferw.close();
    }
}
