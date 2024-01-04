/*
    Que. 5 Write a program to count no of words in a text file and average word size.
 */

import java.io.*;
import java.util.Scanner;

public class CountWord5 {
    public static void main(String[] args) {
        String s = "Java is very simple \nJava is robust \njava is plateform independent";

        try {
            File f = new File("D:\\New folder (2)\\abc.txt");

            FileWriter fw = new FileWriter(f);

            fw.write(s);
            fw.close();
            
            // FileReader fr = new FileReader(f);

            // fr.read();

            Scanner sc = new Scanner(f);

            int count = 0;
            String word = sc.next();
            while (word != null) {
                // System.out.println(word);
                word = sc.next();
                count++;
            }

            System.out.println("No of word in a file : "+count);
            sc.close();
            System.out.println("Successfully Written.....");
        } catch (Exception e) {
            System.out.println("An error occured");
            // TODO: handle exception
        }
    }
}
