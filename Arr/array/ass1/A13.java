// wap to array elements to print sum of Cubic Value.

import java.util.Scanner;
class A13
{
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of  :",i);
			a[i]=input.nextInt();
		}
		System.out.println("\nCubic Array Elements...\n");
		for(int e:a)
		{
			System.out.println(e*e*e);
            
		}
    }
}