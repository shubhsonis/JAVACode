import java.util.Scanner;
class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statement : ");
		String s = sc.nextLine();
		String words[] =s.split(" ");
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String reverse = "";
		for(int j=word.length()-1; j>=0; j--) {
			reverse = reverse+word.charAt(j);
		}
		System.out.print(reverse+" ");
		}
	}
		
}