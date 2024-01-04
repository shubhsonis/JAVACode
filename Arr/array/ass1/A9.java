// Initialize and print all elements of a 2D array.

import java.util.Scanner;
class A9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row = sc.nextInt();
        System.out.println("Enter theno of column");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter the value for the Array ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column;  j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}