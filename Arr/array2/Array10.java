// 2nd max. and 2nd min.
class A10{
    public static void main(String args[]){
        int arr[] = {10,2,7,99,15,1};
        int smax=arr[0], smin=arr[0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(smax<arr[j] && arr[i]>arr[j])
                smax=arr[j];
                if(smin>arr[j] && arr[i]<arr[j])
                smin=arr[j];
            }
           
        }
        System.out.println("2nd max " +smax);
        System.out.println("2nd min " +smin);
            
    }
}