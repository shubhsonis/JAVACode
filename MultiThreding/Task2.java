class Task2 {

    synchronized public void m1() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Called M1()......");
        }
    }

    synchronized public void m2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Called M2()......");
        }
    }

}

class First1 extends Thread {
    Task2 task;

    public First1(Task2 task) {
        this.task = task;
    }

    public void run() {
        task.m1();
    }
}

class Second extends Thread {
    Task2 task;

    public Second(Task2 task) {
        this.task = task;
    }

    public void run() {
        task.m2();
    }
}

class Thread2 {
    public static void main(String[] args) {
        Task2 t = new Task2();

        First1 t1 = new First1(t);
        Second t2 = new Second(t);

        t1.start();
        t2.start();
    }
}
