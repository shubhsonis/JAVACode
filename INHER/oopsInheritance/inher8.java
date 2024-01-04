// Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors. Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
// 	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.
// 	Create a class(say XYZ) with main method that carries out the operation of the project :
// has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
// create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
// display all record from the array.
// search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
// count how many students are having A grade,if for A grade percentage >75.

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
class Student{
    private int rollno;
    private int percentage;

    public Student(){

    }
    public Student(int rollno, int percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    public int getrollno(){
        return rollno;
    }
    public int getPercentage(){
        return percentage;
    }
    public void display(){
        if(rollno==101||rollno==102||rollno==103)
            System.out.println("This Student is School Student ");
            else if(rollno==111||rollno==222){
                System.out.println("This Student is College Student ");
            }
    }
    public void show(){
        System.out.println("\nRoll NO : " +rollno);
        System.out.println("Percentage : " +percentage);
    }
}
class CollegeStudent extends Student{
    private int semester;

    public CollegeStudent(){

    }
    public CollegeStudent(int rollno, int percentage, int semester){
        super(rollno,percentage);
        this.semester = semester;
    }
    public void show(){
        super.show();
        System.out.println("Semester : " +semester);
    }
}
class SchoolStudent extends Student{
    private int classname;

    public SchoolStudent(){

    }
    public SchoolStudent(int rollno, int percentage, int classname){
        super(rollno, percentage);
        this.classname = classname;
    }
    public void show(){
        super.show();
        System.out.println("Classname" +classname);
    }
}

class xyz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student arr[] = new Student[5];
        arr[0] = new CollegeStudent(111, 65, 1);
        arr[1] = new CollegeStudent(222, 68, 2);
        arr[2] = new SchoolStudent(101, 60, 12);
        arr[3] = new SchoolStudent(102, 70, 12);
        arr[4] = new SchoolStudent(103, 73, 10);

        for(int i=0; i<arr.length; i++){
            arr[i].show();
        }
        System.out.println("\nEnter a Roll Number");
        int x = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(x==arr[i].getrollno()){
                arr[i].display();
            }
        }
    }
}
        // if(i==arr.length){
        //     System.out.println("This Roll NUmber is Not Present ");
        
//         System.out.println("\nStudent who having Grade 'A'");
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i].getPercentage()>75)
//             count++;
//         }
//         System.out.println(count+ ": Student have A Grade");
//     }
// }