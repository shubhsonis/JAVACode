import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [8];
        System.out.println(" Enter the Elements ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                System.out.println("even num " + arr[i]);
            }else{
                System.out.println("odd num " +arr[i]);
            }


    }
}
}