import java.util.Scanner;

class Person extends Exception {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person() {
        super("Age Only Positive");
    }

}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Name : ");
            String name = sc.nextLine();

            System.out.println("Enter  the Age : ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new Person();
            } else {
                System.out.println(age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At the End.....");
    }
}