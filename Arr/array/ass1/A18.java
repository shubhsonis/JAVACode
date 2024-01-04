class A18{
    public static void main(String[] args) {
        int a[][] = {{5,6,7}, {3,7,56},{8,7,5} };
        int b[][] = {{13,5,2}, {6,9,4}, {6,8,4} };
        int c[][] = new int[3][3];
        
        for(int i=0; i<a.length; i++){
            for (int j = 0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }

        }
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}