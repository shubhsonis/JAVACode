import java.util.Scanner;
class A16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
               System.out.println(arr[i]);
            }
            if (arr[i]>0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
                System.out.println(arr[i]);
            }
            else {
                if(i%2!=0){
                    System.out.println(arr[i]);
                }
                else 
                if(arr[i]<0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

            
        

                    
                
            
        


        

    
