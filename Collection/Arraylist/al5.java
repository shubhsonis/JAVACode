import java.util.ArrayList;
import java.util.Scanner;

class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array list :");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
         System.out.println("Enter kth element :");
         int k = sc.nextInt();
        

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                   // Swap the elements
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                    // int temp = arrayList.get(j);
                    // arrayList.get(j) = arrayList.get(j+1);
                    // arrayList.get(j+1) = temp;
                }
            }
        }
            System.out.println("kth Minimum :"+arrayList.get(k-1));
         System.out.println("kth Maximum :"+arrayList.get(n-k));
        // System.out.println("Sorted array:");
        // for (int num : arrayList) {
        //     System.out.print(num + " ");
        // }
    }
}
