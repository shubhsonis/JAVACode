import java.util.TreeSet;
import java.util.Comparator;

class Student {
    private String name;
    private int age, id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

    public Student() {

    }

    public int compareTo(Student o) {
        return this.id - o.id;
    }
}

class SortById implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByAge implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        int a = o2.getAge() - o1.getAge();
        if (a == 0) {
            return 1;
        }
        return a;
    }
}

public class Pro1 {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<Student>(new SortById());

        ts.add(new Student("shubh", 23, 103));
        ts.add(new Student("prateek", 22, 101));
        ts.add(new Student("hariom", 24, 101));
        ts.add(new Student("rahul", 21, 104));
        ts.add(new Student("rohit", 22, 105));
        for (Student element : ts)
            System.out.println(element);
    }
}
