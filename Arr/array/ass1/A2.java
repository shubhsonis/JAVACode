import java.util.Scanner;
class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size =sc.nextInt();
        String arr[] = new String [size];
        System.out.println("Enter the arry String ");
        for(int i=0; i<size; i++){
            arr[i]= sc.next();

        }
        System.out.println("Enter the name serched");
        String serch = sc.next();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(serch)){
                System.out.println("Name is exixts in array " +serch);
            }
        }
    }
}