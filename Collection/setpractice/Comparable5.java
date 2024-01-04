
import java.util.TreeSet;

// class Car implements Comparable<Car> {
//     private String name;
//     private int id, rank, modelNo;

//     public Car(String nam, int id, int modelNo, int rank) {
//         this.name = nam;
//         this.id = id;
//         this.modelNo = modelNo;
//         this.rank = rank;
//     }

//     public String toString() {
//         return id + " " + name + " " + modelNo + " " + rank;
//     }

//     public int compareTo(Car o) {
//         return modelNo - o.modelNo;
//     }
// }

// public class Comparable5 {
//     public static void main(String args[]) {
//         TreeSet<Teacher> teachers = new TreeSet<Teacher>();

//         teachers.add(new Teacher("Rolls Royce", 5, 22, 500));
//         teachers.add(new Teacher("Range Rover", 2, 24, 295));
//         teachers.add(new Teacher("Thar", 7, 20, 800));
//         teachers.add(new Teacher("Fortuner", 4, 16, 122));
//         teachers.add(new Teacher("Scorpio", 1, 23, 1201));

//         for (Teacher teacher : teachers)
//             System.out.println(teacher);

//     }
// }

class Pattern {
    public static void main(String[] args) {
        // for(int i=1; i<=6; i++){
        //     for(int j=1; j<=5; j++){
        //         if(i==1||j==1||i==6||j==5){
        //             System.out.print("* ");
        //         }else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // } 

        // for(int i=1; i<=4; i++){
        //     for(int j=i; j<4; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // int arr[] = {0,2,1,2,0};
        // for(int i=0; i<=5; i++){
        //     for(int j=1; j<=4; j++){
        //         if(arr[i]>arr[j]){
        //             arr[i] = arr[i] + arr[j];
        //             arr[j] = arr[i] - arr[j];
        //             arr[i] = arr[i] - arr[j];

        //             System.out.println();
        //         }
        //     }
        // }
            int n  =5;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
