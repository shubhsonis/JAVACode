
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name;
    private int id, age;
    private String salary;
    
    public Employee(String nam, int id, int age, String salary) {
        this.name = nam;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSalary(){
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return id + " " + name + " " + age + "";
    }

    public int compareTo(Employee o){
        return Integer.parseInt(this.salary) - Integer.parseInt(o.salary);
    }
}

public class Comparable3 {
    public static void main(String args[]) {
        TreeSet<Employee> employees = new TreeSet<Employee>();

        employees.add(new Employee("shubham", 5, 22,"120000"));
        employees.add(new Employee("Hariom", 2, 24, "200002.2"));
        employees.add(new Employee("Satish", 7, 20, "50000.4"));
        employees.add(new Employee("Ghanshyam", 4, 16, "145000.4"));
        employees.add(new Employee("Rahul", 1, 23, "110000.1"));

        for (Employee employee : employees)
            System.out.println(employee);

    }
}
