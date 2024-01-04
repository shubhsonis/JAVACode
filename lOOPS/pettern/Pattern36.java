public class Pattern36 {
    public static void main(String[] args) {
        for (int i = 69; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                if (i==69||j==65||(i==67&&j==67)||(i==66&&j==66)||(i==67&&j==67)||(i==68&&j==68))
                    System.out.print((char)j);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

// ABCDE
// A  D
// A C
// AB
// A
