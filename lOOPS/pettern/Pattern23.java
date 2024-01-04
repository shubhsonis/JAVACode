
public class Pattern23 {

    public static void main(String[] args) {
        int k=97;
        for(int i=97;i<=101;i++){
            for(int j=97;j<=i;j++){
                if((i==97&&j==97)||(j==97)||(i==101)||(i==98&&j==98)||(i==99&&j==99)||(i==100&&j==100)||(i==101&&j==101))
            {
            System.out.print((char)k);
            k++;
            }
         else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}