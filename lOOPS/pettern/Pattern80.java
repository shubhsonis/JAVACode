public class Pattern80 {

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    if (j == i) {
                        ++k;
                        System.out.print(k);

                    } else if (j == 1) {
                        System.out.print(j);
                    }

                    else {
                        System.out.print(" ");
                    }

                }

                else if (j == 8 - i) {
                    --k;
                    System.out.print(k);

                } else if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
