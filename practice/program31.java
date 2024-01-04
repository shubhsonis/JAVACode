// creat a class Phonebook having fild like name ,phone, address and also contains nested class Personal 
//having fild like 
// relation and method like getinput() and putinput() take all necussary input for record
// A) Created Another nested Static class business having fild like orgaination , dept, mobile and method 
//like accept and show
// B) creat another class contining main function that ask employee choice.
// if choice of user is one ask personal record, else take business entry and display them. 

import java.util.Scanner;

class Phonebook{
    private String name, address;
    private int phoneNo;
    static Scanner sc = new Scanner(System.in);


    public Phonebook(String n, String a, int p){
        name = n;
        address = a;
        phoneNo = p;
    }
    public Phonebook(){}

    public void show(){
        System.out.println("\nName : " +name+
                        "\nPhone no : " +phoneNo+
                        "\nAddress : " +address);
    }

    class Personal{
        private String relation;
        
        public void getInput(){
          System.out.println("\nName : "+name+
                            "\nAddress : "+address+
                            "\nPhone number : "+phoneNo+
                            "\nRelation : "+relation);  
        }

        public Personal(){

        }

        public void putInput(){
            System.out.println("Enter your relation ");
            relation = sc.next();
        }
    }
    
    static class Bussiness{
        private static String org, dept, mobile;

        public  void accept(){
            System.out.println("ENter your Organisation : ");
            org = sc.nextLine();

            System.out.println("Enter Department : ");
            dept = sc.nextLine();

            System.out.println("Enter mobile : ");
            mobile = sc.next();
        }
        public  void show(){
            show();
            System.out.println("\nOrganisation Name : "+org+
                              "\nDepartment : "+dept+
                              "\nMobil : " +mobile);
        }
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  Name ");
        String name = sc.nextLine();

        System.out.println("Enter a Address ");
        String address = sc.nextLine();

        System.out.println("Enter a MObile NUmber ");
        int number = sc.nextInt();

        System.out.println("Enter What Record do you  Want \n (personal/bussiness) : ");
        String choice = sc.next();

        Phonebook person = new Phonebook(name,address,number);
        if (choice.equals("personal")){
            Phonebook.Personal obj = person.new Personal();
            obj.putInput();
            obj.getInput();
        }else {
            Phonebook.Bussiness obj = new Phonebook.Bussiness() ;
            
        }

    }
}




