//45. Write a program to Compare the strings using equals(), compareTo() and == operator
public class Str45 {
    public static void main(String[] args) {
        String s1 = "Praveen";
        String s2 = "Praveen";

        String obj1 = new String("Praveen");
        String obj2 = new String("Praveen");
       // obj2 = obj1;

        // literal pool
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(s1.compareTo(s2));

    }
}
