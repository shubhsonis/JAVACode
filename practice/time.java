import java.util.Scanner;
class Time1{
    private int hour, min, sec;
    public Time1(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    } 
    public Time1(){}

    public void addtime(Time1 t1, Time1 t2){
        this.hour = t1.hour+t2.hour;
        this.min = t1.min+t2.min;
        this.sec = t1.sec+t2.sec;

        if(min>=60){
            hour++;
            min-=60;
        }
        if(sec>=60){
            min++;
            sec-=60;
        }
       // System.out.print(hour+ "Hour"+min+"minuts"+sec+"seconds");
    }
        public void display(){
           System.out.print(hour+ "Hour" +min+ "minuts" +sec+ "seconds");
        }
} 


class Time1Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st time ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        
        System.out.println("Enter 2ND time ");
        int hour2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();

        Time1 t1 = new Time1(hour,min,sec);
        Time1 t2 = new Time1(hour2,min2,sec2);
 
        Time1 t3 = new Time1();
        // t3.addtime(t1,t2);
        t3.addtime(t1,t2);
        t3.display();

    }

}