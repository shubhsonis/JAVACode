
// import java.util.Scanner;
// public class Marksheet {
//     private String name, fatherName, motherName;
//     private int rollNo, dateOfBirth;

//     public Marksheet(String name, String fatherName, String motherName, int rollNo, int dateOfBirth) {
//         this.name = name;
//         this.fatherName = fatherName;
//         this.motherName = motherName;
//         this.rollNo = rollNo;
//         this.dateOfBirth = dateOfBirth;
//     }
//     public Marksheet(){}
// }

    
    
    
    
// class TestMain{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Name ");
//         String name = sc.nextLine();
//         System.out.println("Enter Your Father Name ");
//         String fatherName = sc.nextLine();
//         System.out.println("Enter Your Mothr Name ");
//         String motherName = sc.nextLine();
//         System.out.println("Enter Roll Numer ");
//         int rollNo = sc.nextInt();
//         System.out.println("Enter Your DOB ");
//         int dateOfBirth = sc.nextInt();

//         System.out.println("                        DEVI AHILYABAI UNIV                 ");
//         System.out.println("Exam Name : B.com " + "\nRoll No. : "+rollNo+"Name : "+name+"\nFather Name : "+fatherName+"\nMother Name : ");
//     }
// }

import java.util.Scanner;

class MarkSheet {
    private String name, fatherName, status;
    private int rollNo;

    public MarkSheet() {}

    public MarkSheet(String name, int rollNo, String fatherName, String status) {
        this.name = name;
        this.rollNo = rollNo;
        this.fatherName = fatherName;
        this.status = status;
        // this.sem = sem;
    }

    public void displayMarksheet(int sem) {
        System.out.println("----------------------------------------------------------------------------------"+
                "\n|\t\t\tVIKRAM UNIVERSITY , UJJAIN\t\t\t |" +
                "\n|\t\t\t\tResult 2022-23\t\t\t\t\t |" +
                "\n|--------------------------------------------------------------------------------|"+
                "\n| Exam Name : B.com Sem-" + sem + "\t\t\t\tRoll no. : " + rollNo +"\t\t |"+
                "\n| Name : " + name+"\t\t\t\tFather Name : "+fatherName+
                "|\n| Status : "+status+"\t\t\t\tCollege : Vidhyasagar College   |"+
                "\n|--------------------------------------------------------------------------------|"+
                "\n|\t\t\t\t|       Max Marks     \t|     Marks Obtained     |"+
                "\n|\t   Subject\t\t|-----------------------|------------------------|"+
                "\n|\t\t\t\t|   Theory | Practical\t|   Theory | Practical   |"+
                "\n|-------------------------------|----------|------------|----------|-------------|");
    }

}

class Semester1 extends MarkSheet {
    private int m1, m2, m3, m4, m5, m6, p1, p2, p3;

    public Semester1(String name, int rollNo, String fatherName, String status) {
        super(name, rollNo, fatherName, status);
        // this.sem = sem;
    }

    public Semester1(){}

    public void displayMarksheet(int s) {
        // System.out.println("Enter Sub-1 marks : " ); 

        super.displayMarksheet(s);
        
        System.out.println("|Fundamentals of IT & Computers |    60    |    10\t|    "+m1+"    |     "+p1+"\t |"+
        "\n|Operating Systems \t\t|    60    |     -\t|    "+m2+"    |     -   \t |"+
        "\n|Digital Electronics\t\t|    60    |    20\t|    "+m3+"    |     "+p2+"\t |"+
        "\n|Advanced Mathematics\t\t|    60    |    20\t|    "+m4+"    |     "+p3+" \t |"+
        "\n|Basic Mathematics\t\t|    60    |     -\t|    "+m5+"    |     -   \t |"+
        "\n|Organizational Behaviour\t|    60    |     -\t|    "+m6+"    |     -   \t |"+
        "\n|-------------------------------|----------|-------------------------------------|"+
        "\n|\tGrand Total \t\t| \t\t\t\t\t\t |"+
        "\n|-------------------------------|------------------------------------------------|");       
    }
}
class Semester2 extends Semester1{
    public Semester2(){}

    public Semester2(String name, int rollNo, String fatherName, String status){
        super(name, rollNo, fatherName, status);          
    }
    public void displayMarksheet(int s){
        super.displayMarksheet(s);
    }

}
class Semester3 extends Semester2{
    public Semester3(){}

    public Semester3(String name, int rollNo, String fatherName, String status){
        super(name, rollNo, fatherName, status);          
    }
    public void displayMarksheet(int s){
        super.displayMarksheet(s);
    }

}
class Semester4 extends Semester3{
    public Semester4(){}

    public Semester4(String name, int rollNo, String fatherName, String status){
        super(name, rollNo, fatherName, status);          
    }
    public void displayMarksheet(int s){
        super.displayMarksheet(s);
    }

}
class Semester5 extends Semester4{
    public Semester5(){}

    public Semester5(String name, int rollNo, String fatherName, String status){
        super(name, rollNo, fatherName, status);          
    }
    public void displayMarksheet(int s){
        super.displayMarksheet(s);
    }

}
class Semester6 extends Semester5{
    public Semester6(){}

    public Semester6(String name, int rollNo, String fatherName, String status){
        super(name, rollNo, fatherName, status);          
    }
    public void displayMarksheet(int s){
        super.displayMarksheet(s);
    }

}
class MarkSheetMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MarkSheet arr [] = new MarkSheet[6];
        // System.out.println("Enter your Name : ");
        // String name = sc.nextLine();

        // System.out.println("Enter your father name ");
        // String fathername = sc.nextLine();

        // System.out.println("Enter your Mother Name ");
        // String motherName = sc.nextLine();

        // MarkSheet sem[] = new MarkSheet[6];

        // for (int i = 0; i < sem.length; i++) {
            MarkSheet obj = new Semester1("Shubham soni", 12345678,"Narendra Soni", "Regular");
        // }
        obj.displayMarksheet(1);
        obj.displayMarksheet(2);
        obj.displayMarksheet(3);
        obj.displayMarksheet(4);
        obj.displayMarksheet(5);
        obj.displayMarksheet(6);
    }
}
