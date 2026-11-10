package homework4;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class main1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("example.txt");
        BufferedReader bufferr = new BufferedReader(fr);
        String l;
        l = bufferr.readLine();
        bufferr.close();
    }
}
