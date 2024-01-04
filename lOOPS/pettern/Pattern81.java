public class Pattern81 {
    public static void main(String[] args) {
        int i = 1, j, k = 0;
        for (i = 1; i <= 7; i++) {
            if (i <= 4)
                k++;
            else
                k--;
            for (j = 1; j <= 7; j++) {
                if (j >= 5 - k && j <= 3 + k)
                {
                    if((i+j)%2==0){
                        System.out.print("_");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }

               
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
