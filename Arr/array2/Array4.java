class A4{
    public static void main(String args[]){
        int arr[] = {3,10,5,7,22,78,6,8,89};
        System.out.println("Array elements after sorting:");
        // shorting logic 
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int tem=0;
                if(arr[i]>arr[j]){
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
            System.out.println(arr[i]);
        }
    }
}