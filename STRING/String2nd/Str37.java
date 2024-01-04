//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'

class Str37 {
	public static void main(String args[]) {
	String s = "inFoBeans"; int count=0;
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='x')
		count++;
	}
	if(count>0)
		System.out.println("present x in given string ");
	else 
		System.out.println("Not present x in given string");
	}
}