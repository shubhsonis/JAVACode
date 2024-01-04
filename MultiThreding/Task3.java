// public class Task3 {
//     synchronized public void m1(){
//         System.out.println("m1() Called ");
//     }
//     synchronized public void m2(){
//         System.out.println("m2() Called ");
//     }
//     public void m3(){
//         System.out.println("m3() Called ");
//     }
// }
// class First2 extends Thread{
//         Task3 task; 
//         public First2(Task3 task){
//             this.task = task;   
//         }
//         public void run() {
//             task.m1();
//         }
// }
// class Thread3{
//     public static void main(String[] args) {

//     }
// // }
// import java.util.Scanner;

// class A1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a  NUmber ");
//         int n = sc.nextInt();
//         int count = 0; 
//         int i = 1;
//         while (i <= n) {
//             if (i % n == 0) {
//                 count = count+ i;
//                 i++ ;
//             }
//             if (count == 2)
//                 System.out.println("Prime NO = ");
//             else {
//                 System.out.println("Not a prime num");
//             }
//         }

//     }
// }

class A {

    synchronized public void m1(B obj) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.printl(Thread.currentThread().getName() + "m1() call ");
            }
            obj.p2();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void m2() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("m2 () call ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class Task1 extends Thread {
    private A a;
    private B b;

    public Task1(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        a.m1(b);

    }
}

class B {

    synchronized public void p1(A obj) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "p1 () called before m2() called ");
            }
            obj.m2();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "p1() called after m2() called....");
            }
        } catch (Exception e) {
            // TODO: handle exception

        }

    }

    synchronized public void p2() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "p2 () call ");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}

class Task2 extends Thread {
    private B b;
    private A a;

    public Task2(A a, B b) {
        this.b = b;
        this.a = a;
    }

    public void run() {
        b.p1(a);
    }
}

class Thread3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Task1 task1 = new Task1(a, b);
        Task2 task2 = new Task2(a, b);

        task1.start();
        task2.start();
    }
}