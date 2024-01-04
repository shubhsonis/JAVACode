class A2{
    public static void main(String[] args) {
        int arr[] = new int[] {6,5,-1,7,90,45,34,-55};
        System.out.println("Array alements after shorting ");
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    int tmp = 0;
                    if(arr[i]>arr[j]){
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
                System.out.println(arr[i]);
            }
        

    }
}