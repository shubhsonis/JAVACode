// 27. Write a Java program to Swap Two Strings
import java.util.Scanner;
class StrSwap {
    private String str1 , str2;
    public StrSwap(String str1 , String str2){
        String temp = str1;
        this.str1 = str2;
        this.str2 = temp;
    }
    public void display(){
        System.out.println("After Swaping.....");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}
class StrSwapMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String");
        System.out.println("Before Swaping......");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        StrSwap obj = new StrSwap(str1 , str2);
        obj.display();
    }
}