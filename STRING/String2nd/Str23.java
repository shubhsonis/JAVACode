//23. Write a Java program to trim any leading or trailing whitespace from a given string

class Str23 {
	public static void main(String args[]) {
		String str = "Indore is the cleanest city of India"; 
		String word = ""; char c = ' ';
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
			word += str.charAt(i);
		}
		System.out.print(word);
	}
}