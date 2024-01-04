//11) Input name of a person and count how many vowels it contains. Use String class methods.

class Vowel {
	public static void main(String args[]) {
		String name = "infobeans foundation";
		int count=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' ||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
				count++;
		}
		System.out.print("Vowel = "+count);
	}
}