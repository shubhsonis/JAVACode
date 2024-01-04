public class Pattern39 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print(i-j+1);
                   
                }

            }
            System.out.println();
        }
    }
}

// 123456
// 54321
// 1234
// 321
// 12
// 1
