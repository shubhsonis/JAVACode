

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int id, age;
    
    public Person(String nam, int id, int age) {
        this.name = nam;
        this.id = id;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age + "";
    }

    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }
}

public class Comparable4 {
    public static void main(String args[]) {
        TreeSet<Person> persons = new TreeSet<Person>();

        persons.add(new Person("shubham", 5, 22));
        persons.add(new Person("Hariom", 2, 24));
        persons.add(new Person("Satish", 7, 20));
        persons.add(new Person("Ghanshyam", 4, 16));
        persons.add(new Person("Rahul", 1, 23));

        for (Person person : persons)
            System.out.println(person);

    }
}
