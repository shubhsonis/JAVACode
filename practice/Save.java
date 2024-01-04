public class Save {
    public static void main(String[] args) {
        int x[][]={{8,7,3},{9,5,12},{13,15,4}};
        int sum,a=0,check=0;
        for(int r=0;r<x.length;r++){
            sum=0;
            for(int c=0;c<x[r].length;c++){
                sum=sum+x[r][c];
            }
            if(check<sum){
                check=sum;
                a=r;
            }
        }
        for(int i=0;i<x.length;i++){
            System.out.print(x[a][i]+" ");
        }
    }
}
