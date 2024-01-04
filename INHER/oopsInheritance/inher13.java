// Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
// Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).
// Display all employee info using toString() method.

import java.util.Scanner;
class Employee extends Object{
    private int  salary;
    private String name, empId;
    
    public Employee(String empId, int salary, String name){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
    }
    public String getEmpid(){
        return empId;
    }
    public String toString() {
        return ("\nEmployee Id : "+empId+"\nName :"+name+"\nSalary : "+salary);
    }
}
class xyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee arr[] = new Employee[5];

        arr[0] = new Employee("101A", 50000, "shubham");
        arr[1] = new Employee("102B", 20000, "hariom");
        arr[2] = new Employee("103C", 3000, "prateek");
        arr[3] = new Employee("104D", 5000, "ghansyam");
        arr[4] = new Employee("105E", 1000, "pannu");

        for(int i=0; i<arr.length; i++){
            System.out.println("\n"+arr[i].toString());
        }
       // while(i>=0) {
            System.out.print("\nEnter Employee Id to check : ");
            String str = sc.next();
            int i;
            for(i=0; i<arr.length ; i++) {

                if(str.equals(arr[i].getEmpid())){
                   System.out.println("This Employee Id Present ");
                    break ; 
                }
            }
            if(i==arr.length)
                System.out.println("this empid is not present : ");
        }
    }

            
                
                
 