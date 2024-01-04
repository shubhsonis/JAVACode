 class A8{
    public static void main(String args []){
        int arr[] = new int [] {5,14,45,67,97};
        System.out.print("Original = ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\nIncrement = ");
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]+1;
            System.out.print(arr[i]+ " ");
        }
    }
}