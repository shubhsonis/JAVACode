/*
    Que. 3 Explain transient keyword in java with example. 
*/

import java.io.*;
import java.util.*;

class Transienttest implements Serializable {
    private String userId;
    private transient int password;

    public Transienttest(String id, int p) {
        userId = id;
        password = p;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}

public class Transient3 {
    public static void main(String[] args) {

        String userId = "Prat15";
        int password = 12345;

        Transienttest t = new Transienttest(userId, password);

        try {
            File f = new File("D:\\New folder (2)\\Transient.txt");

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(t);

            FileInputStream fis = new FileInputStream(f);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Transienttest obj = (Transienttest) ois.readObject();

            System.out.println("\nUser Id : " + obj.getUserId() + "\nPassword : " + obj.getPassword());

            fos.close();
            oos.close();
            fis.close();
            ois.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
