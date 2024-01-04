// // Que. 2 What is Serialization ? Write a java program to store the object into the file.

// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;

// public class Serialization implements Serializable {
//     private String name;
//     private int age;

//     public Serialization(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public static void main(String[] args) {
//         Serialization stu = new Serialization("shubham", 25);

//         try  {
//             FileOutputStream fileOut = new FileOutputStream("serialization.ser");
//             ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

//             objOut.writeObject(stu);
//             System.out.println("Student Object has been serialized");

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         try (FileInputStream fileIn = new FileInputStream("serialization.ser");
//                 ObjectInputStream objIn = new ObjectInputStream(fileIn)) {

//             Serialization deserialize = (Serialization) objIn.readObject();
//             System.out.println("Deserialized Student object: " + deserialize.getName() + ", " + deserialize.getAge());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Serialization implements Serializable {
    private String name;
    private int age;

    public Serialization(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

  class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name :");
        String name = sc.nextLine();
        System.out.println("Enter age ");
        int age = sc.nextInt();

        Serialization obj = new Serialization(name, age);
        try {
            FileOutputStream f = new FileOutputStream("xyz.txt");
            ObjectOutputStream oof = new ObjectOutputStream(f);

            oof.writeObject(obj);
            System.out.println("Success : ");

            FileInputStream fis = new FileInputStream("xyz.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Serialization deserialize = (Serialization) ois.readObject();
            System.out.println("Deserialized Student object: " + deserialize.getName() + ", " + deserialize.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}