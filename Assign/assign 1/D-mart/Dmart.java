import java.util.Scanner;

public class Dmart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t**WELL-COME IN D-MART MALL**\t\t\t");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer Gender: ");
        char gender = sc.next().charAt(0);
        int item1 = 10, item2 = 20, item3 = 30, item4 = 40, item5 = 50,
                item6 = 60, item7 = 70, item8 = 80, item9 = 90, item10 = 100;
        System.out.print("Item1 : Quantity : ");
        int itemQ1 = sc.nextInt();
        System.out.print("Item2 : Quantity : ");
        int itemQ2 = sc.nextInt();
        System.out.print("Item3 : Quantity : ");
        int itemQ3 = sc.nextInt();
        System.out.print("Item4 : Quantity : ");
        int itemQ4 = sc.nextInt();
        System.out.print("Item5 : Quantity : ");
        int itemQ5 = sc.nextInt();
        System.out.print("Item6 : Quantity : ");
        int itemQ6 = sc.nextInt();
        System.out.print("Item7 : Quantity : ");
        int itemQ7 = sc.nextInt();
        System.out.print("Item8 : Quantity : ");
        int itemQ8 = sc.nextInt();
        System.out.print("Item9 : Quantity : ");
        int itemQ9 = sc.nextInt();
        System.out.print("Item10 : Quantity : ");
        int itemQ10 = sc.nextInt();
        // 1st product---quantiy>4---5% discount on total price
        float totalp1 = 0;
        if (itemQ1 > 4) {
            totalp1 = (item1 * itemQ1) * 0.05f;
        }
        // 5th product ---10%discount on total price
        float totalp5 = 0;
        if (itemQ5 > 0) {
            totalp5 = (item5 * itemQ5) * 0.10f;
        }
        // 10th product ---15%discount on total price
        float totalp10 = 0;
        if (itemQ10 > 0) {
            totalp10 = (item10 * itemQ10) * 0.15f;
        }
        float totalAmt = (item1 * itemQ1 + item2 * itemQ2 + item3 * itemQ3 +
                item4 * itemQ4 + item5 * itemQ5 + item6 * itemQ6 + item7 * itemQ7 + item8 *
                        itemQ8
                + item9 * itemQ9 + item10 * itemQ10);
        float totalBill = (item1 * itemQ1 - totalp1 + item2 * itemQ2 + item3 * itemQ3 +
                item4 * itemQ4 + item5 * itemQ5 - totalp5 + item6 * itemQ6 + item7 * itemQ7 + item8 *
                        itemQ8
                + item9 * itemQ9 + item10 * itemQ10 - totalp10);
        // System.out.println("Totalbill is : "+totalBill);
        // TotalBill > 10,000------15%discount
        float totalBAom = totalBill;
        if (totalBill > 10000) {

            totalBAom = totalBAom - totalBill * 0.15f;
        }
        // totalBill 5000-10000 -----10%
        if ((totalBill > 5000) && (totalBill < 10000)) {
            totalBAom = totalBAom - totalBill * 0.10f;
        }
        // System.out.println("Total bill Amount: "+totalBAom);
        float gst;
        gst = totalBAom * 0.10f;
        // System.out.println("GST is: "+gst);
        float carb = 0, bill = totalBAom + gst;
        float totalAmt1 = totalAmt + gst;
        System.out.println("carry bag: ");
        char carrB = sc.next().charAt(0);
        String carryB = "no";
        if (carrB == 'y') {
            carryB = "yes";
            carb = 10;
            totalAmt1 = totalAmt1 + 10;
            bill = totalBAom + gst + 10;
            // System.out.println("Carry bag----------");
        }
        // System.out.println("BILL: "+bill);
        String gift;
        if (gender == 'f' || gender == 'F') {
            gift = "Cadeberry";
            // System.out.println("Gift : "+gift);
        } else {
            gift = "Ladger Wallet";
            // System.out.println("Gift : "+gift);
        }
        System.out.println("\n\n_________________________________________________________________________________");
        System.out.println("\n\t\t\t\tD-Mart\t\t\t\t\n");
        System.out.println("\tName: " + name + "\t\t\t\tDate:27/10/2022\t");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tItem Name     Quantity     Price     Total     After-discount");
        System.out.println("\tItem-1\t\t" + itemQ1 + "\t   " + item1 + "\t     " + (item1 * itemQ1) + " Rs" + "\t"
                + ((item1 * itemQ1) - totalp1));
        System.out.println("\tItem-2\t\t" + itemQ2 + "\t   " + item2 + "\t     " + (item2 * itemQ2) + " Rs" + "\t"
                + (item2 * itemQ2));
        System.out.println("\tItem-3\t\t" + itemQ3 + "\t   " + item3 + "\t     " + (item3 * itemQ3) + " Rs" + "\t"
                + (item3 * itemQ3));
        System.out.println("\tItem-4\t\t" + itemQ4 + "\t   " + item4 + "\t     " + (item4 * itemQ4) + " Rs" + "\t"
                + (item4 * itemQ4));
        System.out.println("\tItem-5\t\t" + itemQ5 + "\t   " + item5 + "\t     " + (item5 * itemQ5) + " Rs" + "\t"
                + ((item5 * itemQ5) - totalp5));
        System.out.println("\tItem-6\t\t" + itemQ6 + "\t   " + item6 + "\t     " + (item6 * itemQ6) + " Rs" + "\t"
                + (item6 * itemQ6));
        System.out.println("\tItem-7\t\t" + itemQ7 + "\t   " + item7 + "\t     " + (item7 * itemQ7) + " Rs" + "\t"
                + (item7 * itemQ7));
        System.out.println("\tItem-8\t\t" + itemQ8 + "\t   " + item8 + "\t     " + (item8 * itemQ8) + " Rs" + "\t"
                + (item8 * itemQ8));
        System.out.println("\tItem-9\t\t" + itemQ9 + "\t   " + item9 + "\t     " + (item9 * itemQ9) + " Rs" + "\t"
                + (item9 * itemQ9));
        System.out.println("\tItem-10\t\t" + itemQ10 + "\t   " + item10 + "\t     " + (item10 * itemQ10) + " Rs" + "\t"
                + ((item10 * itemQ10) - totalp10));
        System.out.println("----------------------------------------------------------------------------------");
        // totalBill totalBAom
        System.out.println("\t\t\t\t\t\tA.P\t\tD.P");
        System.out.println("\t\t\t\t\t\t" + totalAmt + "\t\t" + totalBAom);
        System.out.println("\tGift:-" + gift + "\t\t\t0.00\t\t0.00");
        System.out.println("\tCarry Bag: " + carryB + "\t\t\t\t" + carb + "\t\t" + carb);
        System.out.println("\tGST(10%)\t\t\t\t" + gst + "\t\t" + gst);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t" + totalAmt1 + "\t\t" + bill + " Rs");
        System.out.println("\n\t\t\t\tThank You\t\t\t\t");
        System.out.println("\t\t\t\t To Vist\t\t\t\t");
        System.out.println("\t\t\t\t D-Mart\t\t\t\t\n");
        System.out.println("_________________________________________________________________________________");
    }
}
