

public class Pattern22 {

    public static void main(String[] args) {
        for(int i=65;i<=69;i++){
            for(int j=65;j<=i;j++){
                if((i==68&&j==66)||(i==68&&j==67))
            {
                  System.out.print(" ");
            }
         else {
                  System.out.print((char)j);
            }
        }
        System.out.println();
    }
}
}
// A
// AB
// A C
// A  D
// ABCDE
