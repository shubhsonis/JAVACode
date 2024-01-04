class posneg{
    public void number(int n){
        if(n>0){
            System.out.println("This Number is positive ");
        }else if(n<0){
            System.out.println("This Number is Negative");
        }
    }
}
class Test{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        posneg obj = new posneg();
        obj.number(n);
    }
}