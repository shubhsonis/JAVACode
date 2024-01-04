/*
    Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, 
    File InputStream).
 */

import java.io.*;
import java.util.*;

public class File1 {
    public static void main(String[] args) {

        try {
            File f = new File("D:\\New folder (2)\\abc.txt");

            if (f.exists())
                f.createNewFile();

            FileOutputStream fous = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fous);

            String s = "Java is simple";

            oos.writeObject(s);

            System.out.println("Successfully Written...... ");

            // FileInputStream fis = new FileInputStream(f);

            // ObjectInputStream ois = new ObjectInputStream(fis);

            // String data = "";

            // Object x = ois.readObject();

            // FileReader fr = new FileReader(f);
            // String data = "";
            // while (true) {
            // int x = fr.read();
            // if (x == -1)
            // break;
            // data += (char) x;
            // }
            // System.out.println(data);

            Scanner sc = new Scanner(f);

            String line = sc.nextLine();

            while (line != null) {
                System.out.println(line);
                line = sc.nextLine();
            }

            oos.close();
            fous.close();
            sc.close();
        } catch (Exception e) {
            // e.printStackTrace();
        }

    }
}