import java.util.Scanner;
class Checkcase{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);   
       
       System.out.println("Enter the character :");
       char ch = sc.next().charAt(0);
       
       if(ch>='A' && ch<='Z'){
          System.out.println(" "+ch +" is in uppercase");

        }
        else {
            System.out.println(" "+ch +" is not in uppercase");
        }
        
    }
}



