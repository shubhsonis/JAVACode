class FibonnaciSeries{
    public Fibonnaci(int n){
        int a=0, b=1, c;
        for(int i=1; i<n; i++){
            c = a+b;
            System.out.print(a+ " ");
            a = b;
            b = c;
        }
    }
}
class Test{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        FibonnaciSeries obj = new FibonnaciSeries();
        obj.Fibonnaci(n);
    }
}