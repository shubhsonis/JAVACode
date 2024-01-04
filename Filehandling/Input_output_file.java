// // Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
// // Stream).
// import java.io.FileInputStream;
// import java.io.FileOutputStream;

// public class Input_output_file {
//     public static void main(String[] args) {
//         String fileName = "practice.txt";

//         try {
//             FileOutputStream fos = new FileOutputStream(fileName);
//             String dataToWrite = "Hello World how are you";
//             fos.write(dataToWrite.getBytes());
//             System.out.println("Data has been written to the file: " + fileName);

//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         try (FileInputStream fis = new FileInputStream(fileName)) {
//             int byteData;
//             StringBuilder fileContent = new StringBuilder();

//             while ((byteData = fis.read()) != -1) {
//                 fileContent.append((char) byteData);
//             }
//             System.out.println("Content of the file: ");
//             System.out.println(fileContent.toString());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

class InputOutput {
    public static void main(String[] args) {
        File f = new File("xyz.txt");
        try {
            FileOutputStream fo = new FileOutputStream(f);
            String dataToWrite = "BABA MAHANKAL KI JAY ";
            byte data[] = dataToWrite.getBytes();
            fo.write(data);
            System.out.println("Data has been Succsessfull Writen in File : " + dataToWrite);


        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File fi = new File("xyz.txt");
            FileInputStream obj = new FileInputStream(fi);
            String data = "";
            int x = obj.read();
            while (true) {
                if (x == -1) 
                    break;
                data = data + (char) x;
                x = obj.read();
            }

            System.out.println("Data : " + data);
            // System.out.println("Read the File : " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
