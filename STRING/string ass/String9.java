/*9) WAP to find word of maximum length in given String.
	Sample Input: Dear Student, you have need to work hard
	Output: Student*/

class String9 {
	public static void main(String args[]) {
		String str = "Dear Student, you have need to work hard";
		String word = "", lword = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word += ch;
			} else {
				if (word.length() > lword.length())
					lword = word;
				word = "";
			}
		}
		System.out.println(lword);
	}
}
