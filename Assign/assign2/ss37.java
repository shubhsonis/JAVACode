import java.util.Scanner;
class Alphabet{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);

        System.out.print("Enter a Charachter : ");
        char ch = sc.next().charAt(0);

        if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("Charachter is Alphabet ");
        }else{
            System.out.println("Charachter is  NOt Alphabetl");
        }
    }
}       