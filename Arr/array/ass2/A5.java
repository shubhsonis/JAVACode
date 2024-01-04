import java.util.Scanner;
class A5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nt arr2[] = new int[size];
        System.out.println("Array  size ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size];
    //int arr2[] = new int[size1];
        System.out.println("Array size 2 ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size];

        System.out.print("Enter 1array elements ");
        for(int i=0; i<size1; i++){
            arr1 [i] = sc.nextInt();

        
        System.out.print("Enter 2Array elements");
        for( int j=0; j<size2; j++){
            arr2 [j] = sc.nextInt();
        }
            if(arr1[i]==arr2[j]&& size1==size2){
                System.out.println("This array is Equal ");
            }else{
                System.out.println("This array not equal");
            }
        }

        
    }
}
