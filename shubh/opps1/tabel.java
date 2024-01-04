import java.util.Scanner;
class p4{
  public void Table() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int n1 = sc.nextInt();
    System.out.println("Enter second number : ");
    int n2 = sc.nextInt();
    for (int i =n1; i <= n2; i++) {
        for(int j=1; j<10; j++)
        System.out.println(i+ "*" + j + "=" + (i * j));
        System.out.println();
    }

  }

//class p4Main{
  public static void main(String args[]){
    p4 obj = new p4();
    obj.Table();
  }
}


    


                
            
            
            
    

  
