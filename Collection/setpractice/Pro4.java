import java.util.Comparator;
import java.util.TreeSet;

class Bike {
    private String name, modelNo;
    private double price;

    public Bike(String name, String modelNo, double price) {
        this.name = name;
        this.modelNo = modelNo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModelNo() {
        return modelNo;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return name + " " + modelNo + " " + price;
    }

}
class SortByprice implements Comparator<Bike> {
    public int compare (Bike o1, Bike o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

public class Pro4 {
    public static void main(String[] args) {
        TreeSet<Bike> ts = new TreeSet<Bike>(new SortByprice());

        ts.add(new Bike("Pulser", "876474784", 150000));
        ts.add(new Bike("Apache", "86353738", 145000));
        ts.add(new Bike("MT15", "78363535", 175000));
        ts.add(new Bike("R15", "74847484", 208373));

        for(Bike element : ts){
            System.out.println(element);
        }
    }
}
