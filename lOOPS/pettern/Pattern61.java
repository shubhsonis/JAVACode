public class Pattern61 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = n; j >= 1; j--) {
                if (i >= j) {
                    if ((i == 4 && j == 3)||(i==4&&j==2)||(i==3&&j==2)) 
                        System.out.print("_ ");
                     else
                        System.out.print("X ");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}

        //     X 
        //    X X 
        //   X__X
        //  X____X
        // X X X X X
