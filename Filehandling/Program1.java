import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable {
    private int id;
    private String name;
    private int age;
    private String mobile;

    public Customer(int id, String name, int age, String mobile) {
        this.age = age;
        this.id = id;
        this.mobile = mobile;
        this.name = name;
    }

    public Customer() {

    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setmobile(String mobile) {
        this.mobile = mobile;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public String getmobile() {
        return mobile;
    }
}

class Test {
    public static void main(String[] args) {
        try {
            File f = new File("xyz.txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            Customer c = new Customer(25, "shubham", 21, "8720880733");
            oos.writeObject(c);

            System.out.println("Operation Success....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}