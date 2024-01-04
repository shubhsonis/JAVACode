
import java.util.TreeSet;

class Teacher implements Comparable<Teacher> {
    private String name;
    private int id, age, rank;

    public Teacher(String nam, int id, int age, int rank) {
        this.name = nam;
        this.id = id;
        this.age = age;
        this.rank = rank;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + rank;
    }

    public int compareTo(Teacher o) {
        return rank - o.rank;
    }
}

public class Comparable1 {
    public static void main(String args[]) {
        TreeSet<Teacher> teachers = new TreeSet<Teacher>();

        teachers.add(new Teacher("shubham", 5, 22, 500));
        teachers.add(new Teacher("Hariom", 2, 24, 295));
        teachers.add(new Teacher("Satish", 7, 20, 800));
        teachers.add(new Teacher("Ghanshyam", 4, 16, 122));
        teachers.add(new Teacher("Rahul", 1, 23, 1201));

        for (Teacher teacher : teachers)
            System.out.println(teacher);

    }
}
