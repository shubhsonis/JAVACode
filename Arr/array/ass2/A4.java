class A4{
    public static void main(String[] args) {
        int arr [] = new int [] {5,6,7,8};

        System.out.print("Array before swap ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        int temp= arr[0];
        arr[0] = arr[3];
        arr[3] = temp;

        System.out.print("Array after swap ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
            

            
        
        
    
