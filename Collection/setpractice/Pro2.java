import java.util.Comparator;
import java.util.TreeSet;

class Shop {
    private String shopname;
    // private String name;
    private int gstnumber;
    private int mobnumber;

    public Shop(String shopname, String name, int gstnumber, int mobnumber) {
        this.shopname = shopname;
        // this.name = name;
        this.gstnumber = gstnumber;
        this.mobnumber = mobnumber;

    }

    public Shop() {
    }

    public String getShopname() {
        return shopname;
    }

    // public String getName() {
    //     return name;
    // }

    public int getGstNumber() {
        return gstnumber;
    }

    public int getMobNumber() {
        return mobnumber;
    }

    public String toString() {
        return shopname + " "  + gstnumber + " " + mobnumber;
    }
}


class SortByGstnumber implements Comparator<Shop> {
    public int compare(Shop o1, Shop o2) {
        return o2.getGstNumber() - o1.getGstNumber();
        
    }
}

public class Pro2 {
    public static void main(String[] args) {

        TreeSet<Shop> ts = new TreeSet<Shop>(new SortByGstnumber());

        ts.add(new Shop("Swarnkar  Jeweller showroom ", "SHUBH", 1045, 836736));
        ts.add(new Shop("rollys&Royals showroom", "Prateek", 1039, 94004837));
        ts.add(new Shop("Hariom PArty shop  ", "hariom", 1033, 94004647));
        ts.add(new Shop("kirana shop ", "rohit", 1031, 9673839));
        ts.add(new Shop("cloth collection ", "ghanshyam", 1029, 9400445));
        ts.add(new Shop("rollys&Royals showroom", "Prateek", 1039, 94004837));

        for (Shop element : ts)
            System.out.println(element);
    }
}
