//35. Write a Java program to find maximum between two string

class Str35 {
	public static  void main(String args[]) {
		String s1 = "Praveen";
		String s2 = "Mukati";
		int count=0, count1=0;
		for(int i=0; i<s1.length(); i++) 
			count++;
		for(int i=0; i<s2.length(); i++) 
			count1++;
		if(count>count1)
			System.out.println(s1+" String is maximum ");
		else if(count1>count)
			System.out.println(s2+" String is maximum");
		else
			System.out.println("Both are equal ");
	}
}