
import java.util.TreeSet;
import java.util.Comparator;

class Customer {
    private String name, prodName;
    private int id, age;
    
    public Customer(String nam, int id, int age, String prodName) {
        this.name = nam;
        this.id = id;
        this.age = age;
        this.prodName = prodName;
    }

    public String getName() {
        return name;
    }

    public String getProdName(){
        return prodName;
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

    public int compareTo(Customer o){
        return this.id - o.id;
    }
}

class SortById implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}

public class Comparator3 {
    public static void main(String args[]) {
        TreeSet<Student> students = new TreeSet<Student>(new SortById());

        students.add(new Student("shubham", 5, 22));
        students.add(new Student("Hariom", 2, 24));
        students.add(new Student("Satish", 7, 20));
        students.add(new Student("Ghanshyam", 4, 16));
        students.add(new Student("Rahul", 1, 23));

        for (Student student : students)
            System.out.println(student);
    }
}
