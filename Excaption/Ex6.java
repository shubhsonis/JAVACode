class Leap extends Exception{
   public Leap(){
    super("Exception ! enter the leap year only");
   }
}

class Main{
    public static void main(String args[]){
      try{ 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year%4==0 || year%100==0 || year%400==0)
         System.out.println("It is leap year, Thanks for input"); 
        else
			 throw new Leap();          
      }
      catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("At the end.....");
    }
}