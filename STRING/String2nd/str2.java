// 2. Write a Java program to get the character at the given index within the String
import java.util.Scanner;

class StrIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Index which you want to get: ");
        int x = sc.nextInt();
        
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(x==i){
                System.out.println(a[i]);
                break;
            }
        }
       
    }
}
