public class Pattern68 {

    public static void main(String[] args) {
        int n = 5;
        char ch='A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i || j == 4 + i || i == 5) {
                    System.out.print(ch);
                } 
                else if (j <6 - i || j >4 + i) {
                    System.out.print(" ");
                }

                else {
                    System.out.print(" ");
                }
            }
            ch++;
            System.out.println();

        }

    }

}
