import java.util.Scanner;
class Temperature{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Chose 'c' or 'f' ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Temperature");
        int tem = sc.nextInt();

        if(ch=='c'||ch=='C'){
        float a = (tem-32)*5/9;
        System.out.println(" Celsius " +a);
        }else{
            float b = (tem*9/5)+32;
            System.out.println(" Fahrenheit " +b);
        }
            
        
    }
}


