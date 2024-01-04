public class Pattern76 {

    public static void main(String[] args) {
        int n = 5, p = 9;
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= 9; j++) {
                if (j == i || j == 10 - i || i == 1) {
                    if ((i + j) == 10) {
                        System.out.print(p);
                        p = p - 2;
                    } else {
                        System.out.print(k);
                        k++;
                    }

                }
                else if(j<=i||j>=10-i){
                    System.out.print(" ");
                }
                
                else {
                    System.out.print("+");
                }

            }
            System.out.println();

        }

    }
}