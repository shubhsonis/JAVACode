import java.util.Scanner;
class Checkcase{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
    if(ch>='a'&&ch<='z'){
        System.out.println("This character is lowercase ");
    }else{
        System.out.println("This character is  uppercase");
    }
    }
}
