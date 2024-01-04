
import java.io.File;

// public class Program2 {
//     public static void main(String[] args) {
//         File f = new File("C:\\Users\\hp\\Desktop\\java\\Filehandling\\xyz.txt");
//         if (f.exists()) {
//             System.out.println("File Name : " + f.getName());
//             System.out.println("File Location " + f.getAbsolutePath());
//             System.out.println("File Writeble " + f.canWrite());
//             System.out.println("File Readble : " + f.canRead());
//             System.out.println("File Length : " + f.length());
//         } else {
//             System.out.println("File Dose not Exists ");
//         }
//     }
// }
// import java.io.Serializable;
// class A implements Serializable{

// }
class File1 {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\hp\\Documents\\File Handling\\abc.txt");
          
            if (!f.exists()) {
                f.createNewFile();
            }
            String s = "Jay Shree Ram";

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
