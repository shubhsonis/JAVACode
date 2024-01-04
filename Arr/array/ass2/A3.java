class A3{
    public static void main(String[] args) {
        int arr [] = new int [] {1,2,3,4};

        System.out.println(" Array before Swap ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        int tem = arr[1];
        arr[1] = arr[2];
        arr[2] = tem;

        System.out.println(" Array after swap ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }

    }
}