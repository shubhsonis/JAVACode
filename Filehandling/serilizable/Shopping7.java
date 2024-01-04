
/*
    Que. 7 Write a program to store your shopping details in a binary file(shopping.dat) with 
    information itemName, price, quantity. (Use ObjectOutputStream to store Item class object). 
*/
import java.io.*;
import java.util.Scanner;

class Item {
    private String itemName;
    private float price;
    private int quantity;

    public Item(String itemName, float price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public Item() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

public class Shopping7 {
    public static void main(String[] args) {

        String itemName = "Fevicol";
        int price = 5;
        int quantity = 10;

        try {
            Item item = new Item(itemName, price, quantity);

            File f = new File("D:\\New folder (2)\\Shopping.dat");

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(item);
            
            FileInputStream fis = new FileInputStream(f);
            int data = fis.read();

            fis.close();
            System.out.println(data);
            System.out.println("Operation Success......");
        } catch (Exception e) {
            System.out.println("An error occured.....");
            // TODO: handle exception
        }
    }
}