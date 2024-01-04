/*
    Que. 6 Write a program to count number of bytes in a image file (jpeg /png/gif). Also find 
    how much time it will take to upload the file on server if internet speed is 256 bps 
    (bits per second). 
*/

import java.io.*;

public class Image6 {
    public static void main(String[] args) {
        try {

            String s = "Java is simple";
            File f = new File("D:\\New folder (2)\\Doc1.docx");
            long size = f.length();

            System.out.println("Length of the image file : "+size);

            System.out.println("Time it will take when Internet Speed will be 256 bps : "+((float)size/32)/60+" minutes ");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
