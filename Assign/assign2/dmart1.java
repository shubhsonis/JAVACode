import java.util.Scanner;
class Billing{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the Name of cus : ");
      String name = sc.next();
      System.out.println("Gender");
      String gender = sc.next();
      System.out.println("Item 1");
      String it1= sc.next();
      System.out.println("Quantity");
      int q1 = sc.nextInt();   
      System.out.println("Item 2");
      String it2= sc.next();
      System.out.println("Quantity");
      int q2 = sc.nextInt();
      System.out.println("Item 3");
      String it3= sc.next(); 
      System.out.println("Quantity");
      int q3 = sc.nextInt(); 
      System.out.println("Item 4");
      String it4= sc.next();
      System.out.println("Quantity");
      int q4 = sc.nextInt();
      System.out.println("Item 5");
      String it5= sc.next();  
      System.out.println("Quantity"); 
      int q5= sc.nextInt();
      System.out.println("Item 6");
      String it6= sc.next();
      System.out.println("Quantity");
      int q6 = sc.nextInt();  
      System.out.println("Item 7");
      String it7= sc.next();
      System.out.println("Quantity");
      int q7= sc.nextInt();
      System.out.println("Item 8");
      String it8= sc.next();
      System.out.println("Quantity");
      int q8= sc.nextInt();
      System.out.println("Item 9");
      String it9= sc.next();
      System.out.println("Quantity");
      int q9= sc.nextInt();
      System.out.println("Item 10");
      String it10= sc.next();
      System.out.println("Quantity");
      int q10= sc.nextInt();
      System.out.println("Carry bag");
      String bag= sc.next(); 
      float t1= q1*10f, t2= q2*20, t3= q3*30, t4= q4*40, t5= q5*50, t6= q6*60, t7= q7*70, t8= q8*80, t9= q9*90, t10=q10*10; 
      float dis=0, dis2= (t1*10)/100f,dis3= (t10*15)/100f;
      float a1=t1-dis, a2= t5-dis2, a3= t10-dis3; 
      float ed,tp= a1+a2+a3+t1+t2+t3+t4+t5+t6+t7+t8+t9;

    if(q1>4)
        dis = (t1*5/100f);

      float gst = (tp*10)/100f;
      if(tp>10000)
         ed= tp*15/100f;
      else 
         ed= tp*10/100f;       
     
      System.out.println("t\t\t\tD-mart\n\n");
      System.out.println("Name :"+name+"t\t\t\t\t\tDate : 09/06/2023");
      System.out.println("-------------------------------------------------------------------------\n");
      System.out.println("Item Name \tQuantity  \tPrice  \tTotal \tAfter-Discount");
      System.out.println(it1+"\t\t" +q1+"\t\t"+"10"+ "\t"+t1+"\t\t"+a1);
      System.out.println(it2+"\t\t" +q2+"\t\t"+"20"+"\t"+t2+"\t\t"+t2);
      System.out.println(it3+"\t\t" +q3+"\t\t"+"30"+"\t"+t3+"\t\t"+t3);
      System.out.println(it4+"\t\t" +q4+"\t\t"+"40"+"\t"+t4+"\t\t"+t4);
      System.out.println(it5+"\t\t" +q5+"\t\t"+"50"+"\t"+t5+"\t\t"+a2);
      System.out.println(it6+"\t\t" +q6+"\t\t"+"60"+"\t"+t6+"\t\t"+t6);
      System.out.println(it7+"\t\t" +q7+"\t\t"+"70"+"\t"+t7+"\t\t"+t7);
      System.out.println(it8+"\t\t" +q8+"\t\t"+"80"+"\t"+t8+"\t\t"+t8);
      System.out.println(it9+"\t\t" +q9+"\t\t"+"90"+"\t"+t9+"\t\t"+t9);
      System.out.println(it10+"\t\t" +q10+"\t\t"+"100"+"\t"+t10+"\t\t"+a3);
      System.out.println("-------------------------------------------------------------------------");
      System.out.println("\t\t\tGrand Total\t"+(t1+t2+t3+t4+t5+t6+t7+t8+t9+t10)+( "\t\t"+tp));
      byte ba;
     
      if(gender=="f"||gender=="F"){
        System.out.println("Gift : Cadberry\t"+"\tDiscount\t\t\t"+ed);
      }else{
         System.out.println("Gift : Leader Wallet\t"+"Discount\t\t"+ed);
      }  if(bag=="yes"||bag=="Yes"){
         ba = (byte)10;
         System.out.println("Carry bag :\t\t"+ba);
      }  else 
         ba = 0;
      System.out.println("Carry bag : \t\t"+0);

      System.out.println("t\t\tGst\t\t\t\t"+ gst);
      System.out.println("---------------------------------------------------------------------------");  
      System.out.println("\t\t\tPayable Amount\t\t\t"+(tp+gst-ed+ba)+"\n");
     
    }
}    