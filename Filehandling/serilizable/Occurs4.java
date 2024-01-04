/*
    Que. 4 Write a program to count how many times character ‘t’ occurs in a file.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class Occurs4 {
    public static void main(String[] args) {
        String s = "tttTtTttT";    //   String that want to written in the Occurance.txt file
        int count = 0;

        try {

            //  Write the Path of the file
            File f = new File("D:\\New folder (2)\\Occurrance.txt");

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);

            //  Read the file Occurance.txt
            FileReader fr = new FileReader(f);
            String data = "";

            //  Read file/String char by char
            char ch;
            while ((ch = (char) fr.read()) != (char)-1) {
                if (ch == 't' || ch == 'T'){
                    count++;
                    ch = (char) -1;
                }
            }

            //  
            System.out.println("No of 'T' in Occurs.txt file : "+count);

        } catch (Exception e) {
            
        }
    }
}