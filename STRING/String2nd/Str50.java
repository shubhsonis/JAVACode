//50. Write a program to separate all tokens (words) using StringTokenizer
 class Str50 {
	public static void main(String args[]) {
		String txt = "i love my country";
		System.out.println("Before separate String is : "+txt);
		String str[] = txt.split(" ");
		System.out.println("After separate String is : ");
		for(int i=0; i<str.length; i++) 
			System.out.println(str[i]);
	}
 }
