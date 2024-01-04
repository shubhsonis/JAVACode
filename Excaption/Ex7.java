class Alphabet extends Exception{
   public Alphabet(){
    super("Exception ! enter the alphabet letter only");
   }
}

class Main{
    public static void main(String args[]){
      try{ 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
         System.out.println("Alphabet letter "); 
        else
			 throw new Alphabet();          
      }
      catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("At the end.....");
    }
}