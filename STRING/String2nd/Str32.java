//32. Write a Java program to print after removing duplicates from a given string
class Duplicate {
	public static void main(String args[]) {
			String txt = "aabbccddd";
			System.out.println(""+txt);
			//System.out.println("New text "+removeDupliChar(txt));
		String newtxt = "";
		for(int i=0; i<txt.length(); i++) {
			char ch = txt.charAt(i);
			if(newtxt.indexOf(ch)==-1) {
				newtxt +=ch;
			}
		}
		System.out.println(newtxt);
	}
}