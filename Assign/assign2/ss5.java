import java.util.Scanner;
class Age{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Age of 1st person");
    byte a = sc.nextByte();
    System.out.println("Enter Age of 2nd person");
    byte b = sc.nextByte();
    System.out.println("Enter Age of 3rd person");
    byte c = sc.nextByte();
    
    if((a>b)&&(a>c)){
        System.out.println("1st person is oldest and 2nd or 3rd person Younger");
    }else if(b>c){
        System.out.println("2nd person is oldest and 1st or 3rd person Younger");
    }else{
        System.out.println("3rd person is oldest and 1nd or 2nd person Younger");
    }
    }
}
