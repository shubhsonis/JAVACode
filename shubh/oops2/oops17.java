// Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.
import java.util.Scanner;
class Employee{
    private int salary, empNo;
    public Employee(int salary, int empNo){
            this.empNo =empNo;
            this.salary = salary;
    }
    public void totalSalary(){
        int totalSalary=0;
         totalSalary = totalSalary+salary;
    }
    public void display(){
        System.out.println(totalSalary);
    }
}
        
        
