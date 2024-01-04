import java.util.Scanner;
class Array7{
    public void sub(int arr[]){
        int ans=0, sum=0;
        for(int i=0; i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        ans++;
                        System.out.print(ans+ " ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
class Test7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter S numbre  ");
        int s = sc.nextInt();

        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr [i] = sc.nextInt();
        }
        Array7 obj = new Array7();
        obj.sub(arr);
        
    }
}

    
