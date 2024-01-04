import java.util.Scanner;
class Leapyear{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
    
        System.out.println("Enter Year (yyyy)");
        int year = sc.nextInt();
        if((year/4)*4==year){
            System.out.print("This year leap year");
        }else{
            System.out.print("This year not leap year");
        }
    }  
}      