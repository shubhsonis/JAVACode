class Task {
    synchronized public void m1() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "Hello .....");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class First extends Thread {
    Task task;

    public First(Task task) {
        this.task = task;
    }

    public void run() {
        task.m1();
    }
}

class Thread1 {
    public static void main(String[] args) {
        Task t = new Task();
        First t1 = new First(t);
        First t2 = new First(t);

        t1.setName("Yogesh");
        t2.setName("Babli");

        t1.start();
        t2.start();
    }
}