// wap to print max and min value in given array.
class Maxarr{  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0], min =arr[0];
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) { 
            for(int j= i+1; j<arr.length; j++) 
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
            if(arr[i]<max)
               min = arr[i];
        }  
        System.out.println("Largest element present in given array: " + max);  
        System.out.println(" " +min);
    }  
}  