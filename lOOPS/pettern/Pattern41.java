public class Pattern41 {
    public static void main(String[] args) {
         int k = 65;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (i * 2 - 1); j++) {
               
                System.out.print((char) k++);
                
            }
            System.out.println();

        }
    }

}

// A
// BCD
// EFGHI
// JKLMNOP
