/*7)WAP to remove the duplicate letters from given String.
	Sample Input: aabbccddd
	Output: abcd */

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