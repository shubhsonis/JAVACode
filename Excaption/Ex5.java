class Even extends Exception{
   public Even(){
    super("enter the even number ");
   }
}

class Main{
    public static void main(String args[]){
      try{ 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%2==1)
          throw new Even();
        else
          System.out.println("Thanks for input");               
      }
      catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("At the end.....");
    }
}




