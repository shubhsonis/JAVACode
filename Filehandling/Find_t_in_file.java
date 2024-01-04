import java.io.FileReader;

public class Find_t_in_file {
    public static void main(String[] args) {
        String fileName = "Character_count.txt";

        try {
            FileReader reader = new FileReader(fileName);
            int character;
            int tCount = 0;

            while ((character = reader.read()) != -1) {
                if (character == 't' || character == 'T')
                    tCount++;
            }
            System.out.println("The character 't' occurs: " + tCount + " time in file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
