class Pattern27 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==2||j==2||i==4||j==4) {
                    if (j % 2 == 0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}