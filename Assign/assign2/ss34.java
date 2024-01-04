import java.util.Scanner;
class Vowel1{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Character ");
        char ch = sc.next().CharAt(0);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println( " is a Vowel.");break;
            default: System.out.println( " is a Non-Vowel Character.");
        }     
    }
}           
               
               
       