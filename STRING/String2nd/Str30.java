//30. Write a Java program How to search a word inside a string?
class Str30 {
	public static void main(String args[]) {
		String s1 = "India is the beautiful country of the world";
		String s3 = s1.split(" ");
		String s2 = "India";
		char ch=' ';
		String word = "";
		for(int i=0; i<s1.length(); i++) {
			 word =  s1.charAt(i);
			if(word==s2){
			System.out.println("Word is present is program");
			}
			System.out.print(word+"");
			word="";
		}
		System.out.println(word);
	}
}