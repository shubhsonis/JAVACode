\import java.io.File;
import java.io.FileWriter;
public class CountWord5 {
    public static void main(String[] args) {
        String s = "Java is a very Simple language ";
        try{
            File f = new File("xyz.txt");

            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();
        }
    }
}
