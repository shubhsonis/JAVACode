
// Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer
import java.util.Scanner;

class MathOperation {

    public void multiply(int a, int b) {
        System.out.println("multiply 2 integer " + a * b);
        // multiply1();
    }

    public void multiply1(float x, float y, float z) {
        System.out.println("Multiply 3 float " + (x * y * z));
        // multiply2();
    }

    public void multiply2(int arr[]) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul = mul * arr[i];
        }

        System.out.println("Multiply Array Element " + mul);
    }

    public void multiply3(int r, double s) {
        double mul = r * s;
        System.out.println("one integer & one double multiply " + mul);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Integer number = ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter Three Float Number ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        System.out.println("Enter Array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("one integer and one double number ");
        int r = sc.nextInt();
        double s = sc.nextDouble();

        MathOperation obj = new MathOperation();
        obj.multiply(a, b);
        obj.multiply1(x, y, z);
        obj.multiply2(arr);
        obj.multiply3(r, s);
    }
}
