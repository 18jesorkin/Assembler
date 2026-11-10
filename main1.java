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
        String l;
        l = bufferr.readLine();
        bufferr.close();
        bufferw.close();
    }
}
