//31. Write a Java program to find first non-repeating character in a string

class Str31 {
	public static void main(String args[]) {
		String str = "aabdnccl"; 
		for(int i=0; i<str.length(); i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}	
			}
			if(count==1) {
				System.out.println(str.charAt(i)+" is a non-repeating character");
				break;
			}
		}
	}
}