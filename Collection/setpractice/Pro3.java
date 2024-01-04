// import java.util.Comparator;
// import java.util.TreeSet;

// class Employee {
//     String name;
//     int empId;
//     int salary;

//     public Employee(String name, int empId, int salary) {
//         this.name = name;
//         this.empId = empId;
//         this.salary = salary;
//     }

//     public Employee() {
//     }

//     public String getName() {
//         return name;
//     }

//     public int getempId() {
//         return empId;
//     }

//     public int getsalary() {
//         return salary;
//     }

//     public String toString() {
//         return name + " " + empId + " " + salary;
//     }

//     public int getId() {
//         return empId;
//     }

// }

// class SortByempId implements Comparator<Employee> {
//     public int compare(Employee o1, Employee o2) {
//         return o1.getId() - o2.getId();
//     }
// }

// public class Pro3 {
//     public static void main(String[] args) {
//         TreeSet<Employee> ts = new TreeSet<Employee>(new SortByempId());

//         ts.add(new Employee("krishna", 102, 15200));
//         ts.add(new Employee("Syam", 104, 15000));
//         ts.add(new Employee("kuldeep", 100, 20000));
//         ts.add(new Employee("Sandeep", 105, 15000));
//         ts.add(new Employee("mohan", 98, 15000));
//         ts.add(new Employee("naman", 106, 15500));

//         for (Employee element : ts)
//             System.out.println(element);
//     }
// }
class A {
    public static void main(String[] args) {
        int n = 7, count = 0;
        for (int i = 0; i < n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2 && n > 1)
            System.out.println("prime");
        else
            System.out.println("not");

    }
}
