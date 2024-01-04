//Find the kth largest and kth smallest element in array

class largest{
    public static void main(String args[]){
        int arr[] = {5,8,9,4,1,2,3};
        int k=4;
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                    //ifelse(a[i]>a[j]){
                    
                  //  }
                }
            }
            if(i==k-1){
                System.out.println(k+" largest elements "+arr[i]);
            }
        }
    }
}