//25. Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0
public class Str25 {
    public static void main(String[] args) {

        String s = "4 5 6 5 5  ";
        String[] spl = s.split(" ");
        int a[] = new int[spl.length];
        int sum = 0;
        for (int i = 0; i < spl.length; i++) {
            a[i] = Integer.parseInt(spl[i]);
            sum = sum + a[i];
            System.out.println(a[i]);
        }
        System.out.println("sum = "+sum);

    }
}
