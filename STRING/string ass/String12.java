/*12) Input data exactly in the following format, and print sum of all integer values.
Sample Input: 67, 89, 23, 67, 12, 55, 66. (Hint use String class split method and Integer class parseInt method)*/

class Str12 {
	public static void main(String args[]) {
		String str = "67 89 23 67 12 55 66";
		String a[] = str.split(" ");
		for(String b: a) {
			System.out.println(b);
		}
		int ch[]=new int[a.length];
		for(int i=0; i<ch.length; i++) {
			ch[i] = Integer.parseInt(a[i]);
		}
		
		int sum = 0;
		for(int i=0; i<ch.length; i++) {
			sum=sum+ch[i];
		}
		System.out.print("Sum = "+sum);
	}
}