 import java.util.Scanner;
 import java.util.InputMismatchException;  
 class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}

class Ex2 {
	public static void main(String args[]) {
		try {
			int division = 12/0;
		}
		catch(Exception e) {
			System.out.println("denominator must not be a zero");
		}
	}
}

class Ex3 {
	public static final String RESET =  "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try{
			try{
			System.out.print(YELLOW+"Enter the String "+RESET);
			String s1 = sc.next();
			System.out.println(GREEN+"At 5th index character is : "+s1.charAt(5)+""+RESET);
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(RED+" "+e+""+RESET);
			}
		System.out.print(YELLOW+"Enter the first number : "+RESET);
		int a = sc.nextInt();
		System.out.print(YELLOW+"Enter the second number : "+RESET);
		int b = sc.nextInt();
		System.out.println(GREEN+"Divison = "+(a/b)+""+RESET);
		}
		catch(InputMismatchException e) {
			//System.out.println(e);
			System.out.println(RED+" "+e.getClass().getName()+""+RESET);
		}
		catch(ArithmeticException e) {
			// System.out.println(e);
			// System.out.println(e.toString());
			// e.printStackTrace();
			// System.out.print(e.getClass().getName()); vgvb 
			System.out.println(RED+"description : "+e.getMessage()+""+RESET);
		}
		System.out.println(BLUE+"End of the program"+RESET);
	}
}

