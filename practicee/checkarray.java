import java.util.Scanner;
class checkArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search element ");
        int  search = sc.nextInt();
        boolean flag= false; 

        for(int i=0; i<arr.length; i++){
            if(search==arr[i]){
                flag = true;
                break;
            }
        }if(flag){
            System.out.println("Element Found ");
        }else{
            System.out.println("Element  not Found ");
        }
         
    }
}