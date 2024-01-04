//41. Write a program to Trim a given string using String.trim() method

class Str41 {
	public static void main(String args[]) {
		String str = "    Hello World";
		char ch = ' '; String word="";
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(ch!=' ') 
				word+=ch;
			if(word!=" ")
				break;
		}
		for(int i=0; i<str.length(); i++)
		System.out.print(str.charAt(i));
	}
}