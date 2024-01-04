/*5. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal 
if they are the same length and contain the same characters in the same positions */

import java.util.Scanner;
class Str5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two String : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		if(s1.equals(s2)) {
			System.out.print("lexicographically equal ");
		}
		else {
			System.out.print("Not equal ");
		}
	}
}