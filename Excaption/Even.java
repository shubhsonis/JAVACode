
import java.util.Scanner;
class Even extends Exception{
	public Even() {
		super("Input the Even number ");
	}
}
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the even number ");
		int num = sc.nextInt();
		try {
			if(num%2==1) 
				throw new Even();
			else 
				System.out.println("Thanks for input even number");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("At the end");
	}
}