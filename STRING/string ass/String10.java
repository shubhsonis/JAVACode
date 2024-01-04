//10) WAP to count the word whose first letter is vowel.
import java.util.Scanner;
class Str10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statement : ");
		String s = sc.nextLine();
		String words[] =s.split(" ");
		int count=0;
		for(int i=0; i<words.length; i++) {
			String word = words[i];
		for(int j=0; j<word.length(); j++) {
			if(word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u')
				count++;
		}
		if(count>0)
		System.out.print(count+" ");
		count=0;
		}
	}
}