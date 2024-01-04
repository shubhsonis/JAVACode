class Swap1 {

    public static void main(String[] args) {

        float first = 5.20f, second = 4.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temporary = first;

        first = second;

        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
