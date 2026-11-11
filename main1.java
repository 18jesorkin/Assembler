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
        if (args.length > 0) {
            File file = new File(args[0]); // args[0] is the first command-line argument

            try {
                // Read the file line by line
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                //Stores label
                String label;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    //checks if line is empty
                    if(line.length() != 0){
                    //if there is a . skips
                    if(line.charAt(0) == '.'){
                        continue;
                    }
                    else{
                    //checks if there is 6 characters
                    if(line.length() >= 6){
                        label = line.substring(0, 6);
                    }
                }}
                else{
                    continue;
                }
                    }
                br.close();
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.err.println("Please provide a file name as a command-line argument.");
        }
    }
}
