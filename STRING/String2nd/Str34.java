//34. Write a Java program to reverse words in a given string

class Str34 {
	public static void main(String args[]) {
		String str = "Java";
		for(int i=str.length()-1; i>=0; i--) 
			System.out.print(str.charAt(i));
	}
}