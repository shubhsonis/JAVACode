class A1{
    public static void main(String[] args) {
        int a[][] = {{8,7,3},{9,5,12},{13,15,4}};
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                for(int s=c+1;s<a[r].length;s++){
                    if(a[r][c]>a[r][s]){
                        a[r][c]=a[r][c] + a[r][s];
                        a[r][s]=a[r][c] - a[r][s];
                        a[r][c]=a[r][c] - a[r][s];
                    }
                }
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}