//Write a program to reverse the array.
class reverse{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,};
        System.out.println("Orignel array ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();    
        System.out.println("Array Reverse ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}