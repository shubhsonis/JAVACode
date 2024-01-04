public class Pattern73 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 65;
            for (int j = 1; j <= 5; j++) {
                if (j >= i && j <= 10 - i) {
                    System.out.print(ch);
                    ch++;

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}