// public class Book {
//     private int price;
//     public Book(int p){
//         price = p;
//     }
//     public Book(){}
    
// }
import java.util.ArrayList;
class Arraylis{
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements opration
        int element = list.get(1);
        System.out.println(element);

        // add elements opration 
        list.add(3, 1);
        System.out.println(list);
    }
}