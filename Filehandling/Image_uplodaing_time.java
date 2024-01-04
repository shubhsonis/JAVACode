// import java.io.File;

// public class Image_uplodaing_time {
//     public static void main(String[] args) {
//         String fileName = "image.jpg";
//         long fileSizeInBytes = 0;

//         try {
//             File file = new File(fileName);
//             if (file.exists() && file.isFile()) {
//                 fileSizeInBytes = file.length();
//                 System.out.println("File size: " + fileSizeInBytes + " bytes");
//             } else {
//                 System.out.println("File does not exist");
//                 return;
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         int internetSpeed = 256;
//         long fileSizeInBits = fileSizeInBytes * 8;
//         long uplodTimeInSeconds = fileSizeInBits / internetSpeed;
//         long uplodTimeMinutes = uplodTimeInSeconds / 60;
//         long uplodTimeSeconds = uplodTimeInSeconds % 60;

//         System.out.println("Time to upload the file at: " + internetSpeed + " bps: ");
//         System.out.println("Minutes: " + uplodTimeMinutes);
//         System.out.println("Seconds: " + uplodTimeInSeconds);
//     }
// }

class First extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}

class Secound extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Image_uplodaing_time {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread Start ");

        First t1 = new First();
        Secound t2 = new Secound();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main-Thread");
        }

        System.out.println("Main-Ended....");
    }
}