
class A11{
    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[50];
        System.out.println(a.length + " previos ");
        a = b;
        System.out.println(a.length + " after assign");

    }
}