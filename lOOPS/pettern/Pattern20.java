
public class Pattern20 {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i==4&&j==2)||(i==4&&j==3))
            {
            System.out.print(" ");
            }
         else {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
}

// 1
// 12
// 1 3
// 1  4
// 12345
