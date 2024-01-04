public class Pattern70 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 9; j++) {
                if (j >= i && j <= 10-i) {
                        System.out.print("*");
                   
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}