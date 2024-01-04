import java.io.*;
import java.util.Scanner;

class PersonDetail implements Serializable {
    private String name;
    private int age;
    private float height;
    private boolean maritialStatus;

    public PersonDetail() {
    }

    public PersonDetail(String n, int a, float h, boolean ms) {
        name = n;
        age = a;
        height = h;
        maritialStatus = ms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(boolean maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

}

public class Serialize2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Name ");
            String name = sc.nextLine();

            System.out.println("Enter age");
            int age = sc.nextInt();

            System.out.println("Enter height ");
            float height = sc.nextFloat();

            System.out.println("Are you Married (y/n)");
            char maritialStatus = sc.next().charAt(0);

            boolean married = false;
            if (maritialStatus == 'y' || maritialStatus == 'Y')
                married = true;

            PersonDetail person = new PersonDetail(name, age, height, married);

            // To write the details of the person into the file
            File f = new File("D:\\New folder (2)\\Person.txt");

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutput oos = new ObjectOutputStream(fos);
            oos.writeObject(person);

            // To read the details of the person from the file
            FileInputStream fis = new FileInputStream(f);

            ObjectInputStream ois = new ObjectInputStream(fis);

            PersonDetail pd = (PersonDetail)ois.readObject();
            
            System.out.println("\nName : " + pd.getName() +
                    "\nAge : " + pd.getAge() +
                    "\nHeight : " + pd.getHeight() +
                    "\nMarried : " + pd.isMaritialStatus());
            
            fis.close();
            ois.close();
            fos.close();
            oos.close();
            sc.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
