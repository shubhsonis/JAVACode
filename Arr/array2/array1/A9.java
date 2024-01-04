class Union{
    public static void main(String args[]){
      int arr1[] = {1,2,3,4,5};
      int arr2[] ={1,2,3};
      //int m=0,n=0,j;
      for(int i=0; i<arr1.length;i++){
            for( int j=0; j<arr2.length; j++){
                if(arr1[i]<arr2[j]){
                    System.out.println(arr1[i++]);
                }
                    else if(arr1[i]>arr2[j]){
                        System.out.println(arr2[j++]);
                    }else{
                        System.out.println(arr2[j]);
                        i++;
                    }
                }
                if(i<arr1){
                    System.out.println(arr1[i++]);
                }if(j<arr2){
                    System.out.println(arr2[j++]);
                }

            }
      }  
    }



