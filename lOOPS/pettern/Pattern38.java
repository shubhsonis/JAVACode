public class Pattern38 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j==1||i==5||(i==4&&j==4)||(i==3&&j==3)||(i==2&&j==2))
                    System.out.print(i);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

// 55555
// 4  4
// 3 3
// 22
// 1
