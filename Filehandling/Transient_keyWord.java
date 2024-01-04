import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private String name;
    private transient double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Transient_keyWord {
    public static void main(String[] args) {
        Employee emp = new Employee("Pratik Shimpi", 50000.0);
        try {
            FileOutputStream fileOut = new FileOutputStream("emp.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(emp);
            System.out.println("Employee object has been serialized");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileIn = new FileInputStream("emp.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            Employee deserialize = (Employee) objIn.readObject();
            System.out.println("Desrialized Employee obj: ");
            System.out.println("Name: " + deserialize.getName());
            System.out.println("Salary: " + deserialize.getSalary());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
