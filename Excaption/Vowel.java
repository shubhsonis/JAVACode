import java.util.Scanner;
class Vowel extends Exception {
	public Vowel() {
		super("Invalid character ! please enter the vowel");
	}
}
class Check {
	public void check(char ch) throws Vowel{
		if(ch=='a' || ch=='A' || ch=='E' || ch=='e' || ch=='o' || ch=='O' || ch=='i' || ch=='I' || ch=='u' || ch=='U' ) 
			System.out.println("Vowel ");
		else 
			throw new Vowel();
	}
}
 class Main {
	 public static void main(String args[]) throws Vowel {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the character ");
		 char ch = sc.next().charAt(0);
		 Check obj = new Check();
		 obj.check(ch);
	 }
 }