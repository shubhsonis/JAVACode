//22. Write a Java program to get a substring of a given string between two specified positions

class Str22 {
	public static void main(String args[]) {
		String txt = "Technolgy is the best features science";
		String ch [] = txt.split(" ");
		int size = txt.length();
		String ch1[] = new String[size+1];
		for(int i=0; i<ch.length; i++) { 
			for(int j=0; j<size; j++) {
			ch1[i]=ch[i];
			}
		System.out.print(ch1[i]);
		}	
		char c = 'o';
		int index = 7;
		for(int i=size-1; i>=index; i--) {
			ch1[i+1]=ch[i]; 
		}
		ch1[index]=c;
		System.out.print("\nAfter adding new char String is :");
		for(int i=0; i<ch1.length; i++) 
			System.out.print(ch1[i]);
	}
}