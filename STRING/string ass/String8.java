/*8) WAP to find out total occurrence of each letter in string.
	 Sample Input: aabbccddd
	 Output:a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times */

class Occur {
	public static void main(String args[]) {
		String str = "aabbccddd";
		int count = 0;
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i) + " found " + count + " times ");
			i = i + (count - 1);
			count = 0;
		}
	}
}