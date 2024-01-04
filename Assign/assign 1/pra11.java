  import java.util.Scanner;
  class Dm{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
 
      
      
       
                        // read input values  
                        System.out.println("Enter the product details: ");  
                        System.out.print("Product ID: ");  
                        id = scan.nextLine();  
                        System.out.print("Product Name: ");  
                        productName = scan.nextLine();  
                        System.out.print("Quantity: ");  
                        quantity = scan.nextInt();  
                        System.out.print("Price (per unit): ");  
                        price = scan.nextDouble();  
                        //calculate total price for a particular product  
                        totalPrice = price * quantity;  
                        //calculates overall price  
                        overAllPrice = overAllPrice + totalPrice;  
                        //creates Product class object and add it to the List  
                        product.add( new Product(id, productName, quantity, price, totalPrice) );  
                        // ask for continue shopping?  
                        System.out.print("Want to add more items? (y or n): ");  
                        //reads a character Y or N  
                        choice = scan.next().charAt(0);  
                        //read remaining characters, don't store (no use)  
                        scan.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
                //display all product with its properties  
                Product.displayFormat();  
                for (Product p : product)   
                {  
                    p.display();  
                }  
                //price calculation  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
                //calculating discount  
                discount = overAllPrice*2/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);  
                //total amount after discount  
                subtotal = overAllPrice-discount;   
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
                //calculating tax  
                sgst=overAllPrice*12/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);  
                cgst=overAllPrice*12/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);  
                //calculating amount to be paid by buyer  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));  
                System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");  
                System.out.println("\t\t\t\t                     Visit Again");  
                // close Scanner  
                scan.close();  
            }    
         
      
