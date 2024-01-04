//33. Write a Java program to find the maximum occurring character in a string

class Str33 {
	public static void main(String args[]) {
		String txt = "aabbcccd";
		int count = 0;
		int max = 0;
		char ch = ' ';
		for(int i=0; i<txt.length(); i++) {
			for(int j=0; j<txt.length(); j++) {
				if(txt.charAt(i)==txt.charAt(j)) {
					count++;
				}
				if(count>max) {
					max=count;
				ch = txt.charAt(i);
				}
			}
			count=0;
		}
		System.out.println(ch+" character found "+max+" times");
	}
}