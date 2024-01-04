
import java.util.TreeSet;

class Customer implements Comparable<Customer> {
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

public class Comparable2 {
    public static void main(String args[]) {
        TreeSet<Customer> Customers = new TreeSet<Customer>();

        Customers.add(new Customer("shubham", 5, 22, "Whisky"));
        Customers.add(new Customer("Hariom", 2, 24, "Vodka"));
        Customers.add(new Customer("Satish", 7, 20, "Sprite"));
        Customers.add(new Customer("Ghanshyam", 4, 16, "Chai"));
        Customers.add(new Customer("Rahul", 1, 23, "Pani"));

        for (Customer customer : Customers)
            System.out.println(customer);

    }
}
