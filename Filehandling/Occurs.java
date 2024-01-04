
// Que. 4 Write a program to count how many times character ‘t’ occurs in a file.
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Occurs {
    public static void main(String[] args) {
        String s = "tttTTtttt";
        int count = 0;
        try {
            File f = new File("xyz.txt");

            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();

            FileReader fr = new FileReader(f);
            String data = "";

            // Read File/String Char By Char
            char ch;
            while ((ch = (char) fr.read()) != (char) -1) {
                if (ch == 't' || ch == 'T') {
                    count++;
                    ch = (char) -1;
                }
            }
            System.out.println("No of 'T' in Occurs.txt file : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
