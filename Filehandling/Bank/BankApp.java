// /*
//     Dear Team member,
//     You have to create Banking application for the admin and user.

//     Admin should have following funtionality :-
//         1. Admin Login
//         2. Admin can manage customer account
//         |->    Create new customer account
//         |->    View particular account information
//         |->    Remove/Block account
//         |->    View all account list

//     Customer should have following functionality :-
//         1. Customer login
//         2. Update/View account Details
//         3. Apply for loan
//         4. View loan statement.
//         5. Transfer Money
//         6. Transaction History

//     Note:- Use File Handling to store the data.
//  */

// // import java.io.File;
// // import java.io.Serializable;
// // import java.util.Scanner;

// // class Bank {

// // }

// // class Admin extends Bank {
// //     private final String userId = "admin123"; // Admin User Id
// //     private final int password = 12345; // Admin Login Password

// //     public Admin() {
// //         Scanner sc = new Scanner(System.in);

// //         // Input Admin User Id
// //         System.out.println("Enter User Id : ");
// //         String adminUserId = sc.next();

// //         // Input Admin Password
// //         System.out.println("Enter Password ");
// //         int adminPass = sc.nextInt();
// //     }

// //     public void createCust() {
// //         Scanner sc = new Scanner(System.in);

// //         // Create new Customer Account
// //         // Input Customer Name
// //         System.out.println("Enter your Name ");
// //         String name = sc.nextLine();

// //         // input Mobile
// //         System.out.println("Enter Mobile no");
// //         String mob = sc.next();

// //         System.out.println("Enter");
// //         Customer c1 = new Customer(userId, userId, userId);
// //     }

// // }

// // class Customer extends Bank implements Serializable {
// //     private String name, mobNo;
// //     private long accNo;
// //     private static String IFSC = "HDFC008300", branch = "SAKET NAGAR INDORE";

// //     public Customer() {
// //     }

// //     public Customer(String n, String m, String a) {
// //         name = n;
// //         mobNo = m;

// //         long min = 100000000000l, max = 999999999999l;
// //         accNo = (long) (Math.random() * (max - min + 1) + min);
// //     }

// // }

// // class Bank1 {
// //     static {
// //         System.out.println("************Welcome to Bank Application************");
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("\n1. Admin login \n2. Customer login \n3. Create new Customer Account");
// //         int choice = sc.nextInt();

// //         switch (choice) {
// //             case 1:
// //                 Admin admin = new Admin();

// //                 break;

// //             case 2:
// //                 System.out.println("Enter User Id");
// //                 String custUserId = sc.next();

// //                 System.out.println("Enter Password");
// //                 int custPass = sc.nextInt();

// //                 File f = new File("Desktop\\" + custUserId);
// //                 try {
// //                     if (f.exists()) {
// //                         f.createNewFile();
// //                     } else {

// //                     }
// //                 } catch (Exception e) {
// //                     e.printStackTrace();
// //                 }
// //             case 3:

// //                 // Customer customer = customerManager.getCustomerByUsername(customerUsername);
// //                 // if (customer != null && customer.getPassword().equals(customerPassword)) {
// //                 // customerMenu(customerManager, customer, scanner);
// //                 // } else {
// //                 // System.out.println("Customer login failed. Please try again.");
// //                 // }
// //                 // break;

// //         }
// //     }
// // }

// // import java.util.Scanner;

// // class Admin {
// //     private static final String ADMIN_USERNAME = "Shubham";
// //     private static final String ADMIN_PASSWORD = "Soni123";

// //     public boolean adminlogin(String admin)
// // }
// // // import java.util.Scanner;

// // class Array {
// // void Search(){
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Enter Array size ");
// // int size = sc.nextInt();

// // int [] arr = new int[size];
// // System.out.println("Enter Array elements ");
// // for(int i=0; i<size; i++){
// // arr[i] =sc.nextInt();

// // }
// // for(int i=0; i<arr.length; i++){
// // int x = 3;
// // if(arr[i]==x){
// // System.out.println("Occurance : "+arr[i]+"of index is "+i);
// // }
// // }

// // }
// // }
// // class Test {
// // public static void main(String[] args) {
// // Array obj = new Array();
// // obj.Search();

// // }
// // }

// /*
//     Dear Team member,
//     You have to create Banking application for the admin and user.

//     Admin should have following funtionality :-
//         1. Admin Login
//         2. Admin can manage customer account
//         |->    Create new customer account
//         |->    View particular account information
//         |->    Remove/Block account
//         |->    View all account list

//     Customer should have following functionality :-
//         1. Customer login
//         2. Update/View account Details
//         3. Apply for loan
//         4. View loan statement.
//         5. Transfer Money
//         6. Transaction History

//     Note:- Use File Handling to store the data.
// */

// import java.io.*;
// import java.util.*;

// class CustomerManage {

// }

// class Admin {
//     private final String userId = "shubh123"; // Admin User Id
//     private final String password = "admin@12345"; // Admin Login Password

//     public Admin() {

//     }

//     public boolean checkLogin(String adminUserId, String adminPassword) {
//         if (adminUserId.equals(userId) && adminPassword.equals(password))
//             return true;
//         return false;
//     }

// }

// class Customer implements Serializable {
//     private List<Customer> customers;
//     private String name, mobNo, userId;
//     private transient String userPassword;
//     private long accNo, balance;
//     private static String IFSC = "SBI000AI83", branch = "Saket Nagar";

//     public Customer() {
//         customers = new ArrayList<>();
//     }

//     public Customer(String name, String mobNo, String userId, String userPassword, long accNo, long bal) {
//         this.name = name;
//         this.mobNo = mobNo;
//         this.userId = userId;
//         this.userPassword = userPassword;
//         this.accNo = accNo;
//         this.balance = bal;
//     }

//     public List<Customer> getCustomers() {
//         return customers;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setMobNo(String mobNo) {
//         this.mobNo = mobNo;
//     }

//     public String getUserId() {
//         return userId;
//     }

//     public void setUserPassword(String userPassword) {
//         this.userPassword = userPassword;
//     }

//     public String getUserPassword() {
//         return userPassword;
//     }

//     public void setBalance(long balance) {
//         this.balance = balance;
//     }

//     public String toFileString() {
//         return userId + "," + userPassword + "," + name + "," + mobNo + "," + accNo;
//     }

//     public void createNewAccount() {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Name of Customer");
//         name = sc.nextLine();

//         System.out.println("Enter Mobile no of Customer");
//         mobNo = sc.next();

//         System.out.println("Enter new User Id ");
//         userId = sc.next();

//         System.out.println("Enter New Password");
//         userPassword = sc.next();

//         long min = 100000000000l, max = 999999999999l;
//         accNo = (long) (Math.random() * (max - min + 1) + min);

//         Customer newCustomer = new Customer(name, mobNo, userId, userPassword, accNo, 5000);
//         customers.add(newCustomer);

//         createCustomerFile();
//         // sc.close();
//     }

//     public void createCustomerFile() {
//         try {
//             File f = new File("\\Desktop\\Bank.txt");

//             FileOutputStream fos = new FileOutputStream(f, true);
//             ObjectOutputStream oos = new ObjectOutputStream(fos);

//             for (Customer i : customers) {
//                 oos.writeObject(i.toFileString());
//             }

//             System.out.println("Your Account was created Successfully.......");
//             // oos.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public void viewParticularAccount(Customer i) {

//         // if (userToFind.equals(i.userId)) {
//         System.out.println("\nName : " + i.name +
//                 "\nMobile No : " + i.mobNo +
//                 "\nAccount No. : " + i.accNo +
//                 "\nBalance : " + i.balance +
//                 "\nIFSC code : " + IFSC +
//                 "\nBranch : " + branch);
//         // } else {
//         // System.out.println("\nUser Not Found.....\nPlease try again...... ");
//         // }
//     }

//     public boolean removeAccount(String userToFind) {

//         for (Customer i : customers) {
//             if (userToFind.equals(i.userId)) {
//                 customers.remove(i);
//                 return true;
//             }
//         }
//         return false;
//     }

//     public void viewAllAccount() {

//         for (Customer i : customers) {
//             System.out.println("\nName : " + i.name +
//                     "\nMobile No. : " + i.mobNo +
//                     "\nAccount No : " + i.accNo +
//                     "\nBalance : " + i.balance +
//                     "\nIFSC : " + IFSC +
//                     "\nBranch : " + branch +
//                     "\nUser Id : " + i.userId + "\n");
//         }
//     }

//     public Customer getCustomer(String userid) {
//         for (Customer i : customers) {
//             if (userid.equals(i.userId))
//                 return i;
//         }
//         return null;
//     }
// }

// class Bank1 {
//     static {
//         System.out.println("\n************Welcome to Bank Application************\n");
//     }

//     // static class TestMain {

//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);

//             Customer customer = new Customer();
//             Admin admin = new Admin();

//             while (true) {
//                 try {

//                     System.out.println("\n1. Admin login \n2. Customer login \n3. Exit");
//                     int choice = sc.nextInt();

//                     switch (choice) {
//                         case 1:

//                             System.out.print("\nEnter Admin UserId : ");
//                             String adminLogin = sc.next();

//                             System.out.print("Enter Admin Password : ");
//                             String adminPassword = sc.next();

//                             if (admin.checkLogin(adminLogin, adminPassword)) {
//                                 adminLogin(customer, sc);

//                             } else {
//                                 System.out.println("Wrong credentials..... ");
//                             }
//                             break;
//                         case 2:
//                             System.out.println("Enter User Id");
//                             String custUserId = sc.next();

//                             System.out.println("Enter Password");
//                             String custPass = sc.next();

//                             Customer cust = customer.getCustomer(custUserId);

//                             if (cust != null && cust.getUserPassword().equals(custPass)) {
//                                 System.out.println("\nCustommer Login Successful.....\n");
//                                 customerLogin(customer, sc, custUserId);

//                             } else {
//                                 System.out.println("\nUser not found.....\nPlease try again.....");
//                                 break;
//                             }

//                         case 3:
//                             System.out.println("Thank You for Visit......");
//                             return;

//                         default:
//                             System.out.println("Invlid number......\nPlease choose right no......");
//                     }
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         }

//         private static void adminLogin(Customer customer, Scanner sc) {

//             try {
//                 while (true) {
//                     System.out.println("1. Create new customer account " +
//                             "\n2. View particular account information" +
//                             "\n3. Remove/Block account" +
//                             "\n4. View all account list" +
//                             "\n5. Exit to login");
//                     int choice1 = sc.nextInt();

//                     switch (choice1) {
//                         case 1:
//                             customer.createNewAccount();
//                             break;

//                         case 2:
//                             System.out.println("Enter User name : ");
//                             String userToFind = sc.next();

//                             boolean flag = false;
//                             for (Customer i : customer.getCustomers()) {
//                                 if (userToFind.equals(i.getUserId())) {
//                                     customer.viewParticularAccount(i);
//                                     flag = true;
//                                     break;
//                                 }
//                             }
//                             if (!flag)
//                                 System.out.println("User not found......");
//                             break;

//                         case 3:
//                             System.out.println("Enter your Username");
//                             String username = sc.next();

//                             if (customer.removeAccount(username))
//                                 System.out.println("Your account was removed successfully......");
//                             else
//                                 System.out.println("User not found......\nPlease try again......");

//                         case 4:
//                             customer.viewAllAccount();

//                         case 5:
//                             return;

//                         default:
//                             System.out.println("Invlid number......\nPlease choose right option......");
//                             break;
//                     }
//                 }

//             } catch (Exception e) {
//                 sc.next();
//             }
//         }

//         private static void customerLogin(Customer customer, Scanner sc, String userId) {
//             System.out.println("1. View account Details\r\n" +
//                     "        2. Update account Details\r\n" +
//                     "        3. Apply for loan\r\n" +
//                     "        4. View loan statement.\r\n" +
//                     "        5. Transfer Money\r\n" +
//                     "        6. Transaction History\r\n");
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     customer.viewParticularAccount(customer);
//                     break;
//                 case 2:
//                     try {
//                         System.out.println("What Do You Want to Update :- ");
//                         System.out.println("\n1. Name \n2. Mobil No. ");
//                         choice = sc.nextInt();

//                         if (choice == 1) {
//                             System.out.println("Enter Name Update ");
//                             String name = sc.nextLine();

//                             customer.setName(name);
//                             System.out.println("Updation process success ");
//                         } else if (choice == 2) {
//                             System.out.println("Enter Mob No Update ");
//                         }

//                     } catch (Exception e) {
//                         // TODO: handle exception
//                     }
//             }
//         }
//     }

// import java.util.Scanner;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;

// class Customer implements Serializable {
//     private String username;
//     private String password;
//     private String name;
//     private String accountno;
//     private String contact;
//     private double balance;
//     private boolean isBlocked;

//     public Customer(String username, String password, String name, String accountno, String contact, double balance,
//             boolean flag) {
//         this.username = username;
//         this.password = password;
//         this.name = name;
//         this.accountno = accountno;
//         this.contact = contact;
//         this.balance = balance;
//         isBlocked = flag;
//     }

//     public Customer() {

//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setAccountno(String accountno) {
//         this.accountno = accountno;
//     }

//     public void setContact(String contact) {
//         this.contact = contact;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public String getUsername() {
//         return username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getAccountno() {
//         return accountno;
//     }

//     public String getContact() {
//         return contact;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public boolean isBlocked() {
//         return isBlocked;
//     }

//     public boolean login(String name, String password) {

//         try {
//             FileInputStream fi = new FileInputStream(
//                     "C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + name + ".txt");
//             ObjectInputStream oi = new ObjectInputStream(fi);

//             Customer o = (Customer) oi.readObject();

//             return (name.equals(o.getUsername()) && password.equals(o.getPassword())) && o.isBlocked();

//         } catch (Exception e) {
//             e.printStackTrace();
//             return false;
//         }
//     }

//     public void block() {
//         isBlocked = false;
//     }

//     public void Withdraw(double amount){

//     }

// }

// class Admin {
//     private static final String admin_username = "shubh";
//     private static final String admin_password = "shubh@123";

//     public boolean login(String username, String password) {
//         return username.equals(admin_username) && password.equals(admin_password);
//     }

//     public void tocreateaccount(Customer obj) {
//         try {
//             File f = new File("C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + obj.getUsername() + ".txt");
//             if (!f.exists()) {
//                 f.createNewFile();
//             }

//             FileOutputStream fo = new FileOutputStream(f);

//             ObjectOutputStream oo = new ObjectOutputStream(fo);
//             oo.writeObject(obj);

//             System.out.println("~~~Account Create Successfully~~~");

//         } catch (Exception e) {
//             System.out.println("Something went wrong");
//         }
//     }

//     public void viewaccountdetail() {
//         try {
//             Scanner sc = new Scanner(System.in);

//             System.out.println("Enter customer's username");
//             String username = sc.nextLine();

//             System.out.println("");
//             FileInputStream fi = new FileInputStream(
//                     "C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + username + ".txt");

//             ObjectInputStream oi = new ObjectInputStream(fi);
//             Customer o = (Customer) oi.readObject();

//             if (username.equals(o.getUsername())) {
//                 System.out.println("Customer username   : " + o.getUsername());
//                 System.out.println("Customer password   : " + o.getPassword());
//                 System.out.println("Customer name       : " + o.getName());
//                 System.out.println("Customer account no.: " + o.getAccountno());
//                 System.out.println("Customer contact    : " + o.getContact());
//                 System.out.println("Customer balance    : " + o.getBalance());
//                 System.out.println("Is blocked : " + o.isBlocked());

//                 // if (!o.isBlocked())
//                 // System.out.println("Your account is not blocked.....");
//                 // else
//                 // System.out.println("Your account is blocked.....");
//                 // System.out.println();

//             } else {
//                 System.out.println("~~No Account~~");
//             }

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public void viewAllAccountDetails() {
//         try {
//             File directory = new File("C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer");
//             File[] fileArray = directory.listFiles();

//             if (fileArray != null) {
//                 for (File file : fileArray) {
//                     try (FileInputStream fi = new FileInputStream(file);
//                             ObjectInputStream oi = new ObjectInputStream(fi)) {
//                         Object obj = oi.readObject();

//                         if (obj instanceof Customer) {
//                             Customer customer = (Customer) obj;
//                             System.out.println("Customer username   : " + customer.getUsername());
//                             System.out.println("Customer password   : " + customer.getPassword());
//                             System.out.println("Customer name       : " + customer.getName());
//                             System.out.println("Customer account no.: " + customer.getAccountno());
//                             System.out.println("Customer contact    : " + customer.getContact());
//                             System.out.println("Customer balance    : " + customer.getBalance());
//                             System.out.println();
//                         } else {
//                             System.out.println("File does not contain a valid Customer object: " + file.getName());
//                         }
//                     } catch (Exception e) {
//                         System.err.println("Error reading file: " + file.getName());
//                         e.printStackTrace();
//                     }
//                 }
//             } else {
//                 System.out.println("No files found in the specified directory.");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public void RemoveBlockAccount(int choice, Scanner sc) {
//         try {
//             switch (choice) {
//                 case 1:
//                     System.out.println("Enter customer username ");
//                     String name = sc.next();

//                     File f = new File("C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + name + ".txt");

//                     if (f.exists()) {
//                         f.delete();
//                     } else {
//                         System.out.println("File not found");
//                     }
//                     break;

//                 case 2:
//                     System.out.println("Enter username ");
//                     String name1 = sc.next();

//                     System.out.println("");
//                     FileInputStream fi = new FileInputStream(
//                             "C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + name1 + ".txt");

//                     ObjectInputStream oi = new ObjectInputStream(fi);
//                     Customer o = (Customer) oi.readObject();

//                     o.block();
//                     break;

//                 default:
//                     break;

//             }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }
// }

// public class BankingApplication {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("~~~Welcome to Banking Application~~~");
//         Customer obj = new Customer();
//         Admin ad = new Admin();
//         boolean flag = true;
//         while (flag) {
//             System.out.println("----------------------------------------");
//             System.out.println("Please select an option:");
//             System.out.println("1. Admin Login");
//             System.out.println("2. Customer Login");
//             System.out.println("3. Exit");
//             System.out.println("----------------------------------------");
//             int choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                     System.out.println("Enter admin username");
//                     String username = sc.next();
//                     System.out.println("Enter admin password");
//                     String password = sc.next();
//                     if (ad.login(username, password)) {
//                         boolean flag1 = true;
//                         while (flag1) {
//                             System.out.println("---------------------------------------");
//                             System.out.println("~~~~~~~~~~~~~ADMIN MENU~~~~~~~~~~~~~~  ");

//                             System.out.println("Enter : 1 for Create Account"
//                                     + "\nEnter : 2 for view particular account"
//                                     + "\nEnter : 3 for view allaccount detail"
//                                     + "\nEnter : 4 for Remove/Block account"
//                                     + "\nEnter : 5 for Exit");
//                             System.out.println("---------------------------------------");
//                             int choice1 = sc.nextInt();

//                             switch (choice1) {
//                                 case 1:
//                                     System.out.print("Enter new customer's username : ");
//                                     String username1 = sc.next();

//                                     System.out.print("Enter new customer's password : ");
//                                     String pass = sc.next();

//                                     System.out.print("Enter new customer's name     : ");
//                                     String name = sc.next();

//                                     System.out.print("Enter new customer's account no. : ");
//                                     String accountno = sc.next();

//                                     System.out.print("Enter new customer's contact  : ");
//                                     String contact = sc.next();

//                                     System.out.print("Enter initial balance          : ");
//                                     double balance = sc.nextDouble();

//                                     while (true) {
//                                         if (balance >= 1000) {
//                                             Customer obj1 = new Customer(username1, pass, name, accountno, contact,
//                                                     balance, true);
//                                             ad.tocreateaccount(obj1);
//                                             break;
//                                         } else {
//                                             System.out.println("Initial Balance must be greater than 1000");
//                                             balance = sc.nextDouble();
//                                         }
//                                     }
//                                     break;

//                                 case 2:
//                                     System.out.println("-------------Customer Account Detail--------------");
//                                     ad.viewaccountdetail();
//                                     break;

//                                 case 3:
//                                     System.out.println("------------All Customer Account Detail------------");
//                                     ad.viewAllAccountDetails();
//                                     break;

//                                 case 4:
//                                     try {
//                                         System.out.println("-------------Remove/Block Detail--------------");
//                                         System.out.println("Enter : 1 for Remove " + "\nEnter : 2 for Block");
//                                         System.out.println("----------------------------------------------");
//                                         int choice3 = sc.nextInt();
//                                         ad.RemoveBlockAccount(choice3, sc);
//                                     } catch (Exception e) {
//                                         e.printStackTrace();
//                                     }
//                                     break;

//                                 case 5:
//                                     flag1 = false;
//                                     break;
//                             }
//                         }

//                     } else {
//                         System.out.println("Admin login failed. Please try again.");
//                     }
//                     break;

//                 case 2:
//                     System.out.println("-------------Customer Login-------------");
//                     System.out.println("Enter username");
//                     String username1 = sc.next();

//                     System.out.println("Enter password");
//                     String password1 = sc.next();
//                     boolean flag2 = true;
//                     while (flag2) {
//                         if (obj.login(username1, password1)) {
//                             System.out.println("~~~~~~~~~~~~~~Customer menu~~~~~~~~~~~~~");
//                             System.out.println("1. Withdraw money " + "\t2. Deposit money");
//                             System.out.println("3. Balance Equiry " + "\t4. Apply for loan");
//                             System.out.println("5. Update Details " + "\t6. Transaction History");
//                             System.out.println("7. Transfer money " + "\t8. Exit");
//                             int choice2 = sc.nextInt();

//                             switch (choice2) {
//                                 case 1:

//                                 case 2:

//                                 case 3:

//                                 case 4:

//                                 case 5:
//                                     try {
//                                         System.out.println("-------------Update Detail------------");
//                                         System.out.println("What do you want to update");
//                                         System.out.println("1. Name " + "\n2. Contact ");
//                                         System.out.println("--------------------------------------");
//                                         int num = sc.nextInt();

//                                         File f = new File("C:/Users/rahul/OneDrive/Desktop/DemoBank/Customer/" + username1+ ".txt");

//                                         FileInputStream fis = new FileInputStream(f);
//                                         ObjectInputStream ois = new ObjectInputStream(fis);
//                                         Customer cust = (Customer) ois.readObject();

//                                         FileOutputStream fos = new FileOutputStream(f);
//                                         ObjectOutputStream oos = new ObjectOutputStream(fos);

//                                         if (num == 1) {
//                                             System.out.println("Enter Name ");
//                                             String name = sc.next();

//                                             cust.setName(name);

//                                             oos.writeObject(cust);
//                                             System.out.println("Update Successfully.....");

//                                         } else if (num == 2) {
//                                             System.out.println("Enter Contact");
//                                             String contact = sc.next();

//                                             cust.setContact(contact);

//                                             oos.writeObject(cust);
//                                             System.out.println("Update Successfully.....");

//                                         } else {
//                                             System.out.println("Wrong credentials.....");
//                                         }

//                                     } catch (Exception e) {
//                                         e.printStackTrace();
//                                     }
//                                     break;
//                                 case 6:

//                                 case 7:

//                                 case 8:
//                                     flag2 = false;
//                                     break;
//                             }
//                         } else {
//                             System.out.println("Customer login failed. Please try again.");
//                             break;
//                         }
//                     }
//                     break;

//                 case 3:
//                     System.out.println("\n~~~~~~~~~~~Thanks for Visit~~~~~~~~~~~~");
//                     flag = false;
//                     break;

//             }

//         }
//     }
// }

//     Dear Team member,
//     You have to create Banking application for the admin and user.

//     Admin should have following funtionality :-
//         1. Admin Login
//         2. Admin can manage customer account
//         |->    Create new customer account
//         |->    View particular account information
//         |->    Remove/Block account
//         |->    View all account list

//     Customer should have following functionality :-
//         1. Customer login
//         2. Update/View account Details
//         3. Apply for loan
//         4. View loan statement.
//         5. Transfer Money
//         6. Transaction History

//     Note:- Use File Handling to store the data.
// */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Transaction {
    private String description;
    private double amount;
    private Date timestamp;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(timestamp);
    }
}

class Customer {
    private String username;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactionHistory;
    private double loanBalance;

    public Customer(String username, String password, String name, String contact, double balance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.balance = balance;
        this.isBlocked = false;
        this.transactionHistory = new ArrayList<>();
        this.loanBalance = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void updateContact(String newContact) {
        contact = newContact;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit", amount);
        }else {
            System.out.println("Invalid Deposit amount ");
        }
    }

    public boolean withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recordTransaction("Withdrawal", -amount);
            return true;
        }else{
            System.out.println("Insufficient Balance or Invalid withdraw amount. ");
        return false;
        }
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }

    public void transferMoney(Customer recipient, double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            recordTransaction("Transfer to " + recipient.getUsername(), -amount);
            recipient.recordTransaction("Received from " + getUsername(), amount);
        }
    }

    public void applyForLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance == 0) {
            loanBalance += amount;
            balance += amount;
            recordTransaction("Loan Received", amount);
        }
    }

    public void repayLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance > 0) {
            loanBalance -= amount;
            balance -= amount;
            recordTransaction("Loan Repayment", -amount);
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount: $" + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println();
        }
    }

    private void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory.add(transaction);
    } 

    public String toFileString() {
        return username + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked + ","
                + loanBalance;
    }

    public void setBlocked(boolean isBlocked2) {
    }
}

class CustomerManager {
    private static final int MAX_CUSTOMERS = 100;
    private Customer[] customers;
    private int customerCount;
    private static final String CUSTOMER_FILE = "customers.txt";

    public CustomerManager() {
        customers = new Customer[MAX_CUSTOMERS];
        customerCount = 0;
        loadCustomersFromFile();
    }

    private void loadCustomersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    customer.block();
                    customer.applyForLoan(Double.parseDouble(data[6]));
                    customers[customerCount++] = customer;
                } else if (data.length == 6) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    boolean isBlocked = Boolean.parseBoolean(data[5]);
                    customer.setBlocked(isBlocked);
                    customers[customerCount++] = customer;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createCustomer(String username, String password, String name, String contact, double balance) {
        if (customerCount < MAX_CUSTOMERS) {
            Customer newCustomer = new Customer(username, password, name, contact, balance);
            customers[customerCount++] = newCustomer;
            saveCustomersToFile();
        } else {
            System.out.println("Cannot create a new customer. Maximum limit reached.");
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] allCustomers = new Customer[customerCount];
        System.arraycopy(customers, 0, allCustomers, 0, customerCount);
        return allCustomers;
    }

    private void saveCustomersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {
            for (int i = 0; i < customerCount; i++) {
                writer.write(customers[i].toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByUsername(String usernameToFind) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(usernameToFind)) {
                return customers[i];
            }
        }
        return null;
    }

    public void blockCustomer(String username

    ) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(username)) {
                customers[i].block();
                saveCustomersToFile();
                return;
            }
        }
    }

    public void unblockCustomer(String username) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getUsername().equals(username)) {
                customers[i].unblock();
                saveCustomersToFile();
                return;
            }
        }
    }

    public boolean transferMoney(String senderUsername, String recipientUsername, double amount) {
        Customer sender = getCustomerByUsername(senderUsername);
        Customer recipient = getCustomerByUsername(recipientUsername);

        if (sender != null && recipient != null) {
            sender.transferMoney(recipient, amount);
            saveCustomersToFile();
            return true;
        }

        return false;
    }

    public void applyForLoan(String username, double amount) {
        Customer customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.applyForLoan(amount);
            saveCustomersToFile();
        }
    }

    public void repayLoan(String username, double amount) {
        Customer customer = getCustomerByUsername(username);
        if (customer != null) {
            customer.repayLoan(amount);
            saveCustomersToFile();
        }
    }
}

class Admin {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void viewAllCustomerAccounts(CustomerManager customerManager) {
        Customer[] customers = customerManager.getAllCustomers();
        System.out.println("All Customer Accounts:");
        for (Customer customer : customers) {
            System.out.println("Username: " + customer.getUsername() + ", Name: " + customer.getName());
        }
    }

    public Customer viewCustomerAccount(CustomerManager customerManager, String username) {
        return customerManager.getCustomerByUsername(username);
    }

    public void blockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.blockCustomer(username);
        System.out.println("Customer account blocked successfully!");
    }

    public void createNewAccount(CustomerManager customerManager, String username, String password, String name,
            String contact, double balance) {
        customerManager.createCustomer(username, password, name, contact, balance);
        System.out.println("New customer account created successfully!");
    }

    public void unblockCustomerAccount(CustomerManager customerManager, String username) {
        customerManager.unblockCustomer(username);
        System.out.println("Customer account unblocked successfully!");
    }
} 

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        CustomerManager customerManager = new CustomerManager();

        System.out.println("Welcome to the Banking Application!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine();

                    if (admin.login(adminUsername, adminPassword)) {
                        adminMenu(admin, customerManager, scanner);
                    } else {
                        System.out.println("Admin login failed. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter customer username: ");
                    String customerUsername = scanner.nextLine();
                    System.out.print("Enter customer password: ");
                    String customerPassword = scanner.nextLine();

                    Customer customer = customerManager.getCustomerByUsername(customerUsername);
                    if (customer != null && customer.getPassword().equals(customerPassword)) {
                        customerMenu(customerManager, customer, scanner);
                    } else {
                        System.out.println("Customer login failed. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Banking Application!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void adminMenu(Admin admin, CustomerManager customerManager, Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View All Customer Accounts");
            System.out.println("2. View Customer Account Information");
            System.out.println("3. Block Customer Account");
            System.out.println("4. Unblock Customer Account");
            System.out.println("5. Create New Customer Account");
            System.out.println("6. Exit Admin Menu");

            int adminChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (adminChoice) {
                case 1:
                    admin.viewAllCustomerAccounts(customerManager);
                    break;

                case 2:
                    System.out.print("Enter the username of the account to view: ");
                    String usernameToView = scanner.nextLine();
                    Customer accountToView = admin.viewCustomerAccount(customerManager, usernameToView);
                    if (accountToView != null) {
                        System.out.println("Account Information:");
                        System.out.println("Username: " + accountToView.getUsername());
                        System.out.println("Name: " + accountToView.getName());
                        System.out.println("Contact: " + accountToView.getContact());
                        System.out.println("Balance: Rs. " + accountToView.getBalance());
                        if (accountToView.isBlocked()) {
                            System.out.println("Account is blocked.");
                        } else {
                            System.out.println("Account is not blocked.");
                        }
                        accountToView.printTransactionHistory();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the username of the account to block: ");
                    String usernameToBlock = scanner.nextLine();
                    admin.blockCustomerAccount(customerManager, usernameToBlock);
                    break;

                case 4:
                    System.out.print("Enter the username of the account to unblock: ");
                    String usernameToUnblock = scanner.nextLine();
                    admin.unblockCustomerAccount(customerManager, usernameToUnblock);
                    break;

                case 5:
                    System.out.print("Enter new customer's username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter new customer's password: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Enter new customer's name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new customer's contact: ");
                    String newContact = scanner.nextLine();
                    System.out.print("Enter initial balance for the new customer: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    admin.createNewAccount(customerManager, newUsername, newPassword, newName, newContact,
                            initialBalance);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void customerMenu(CustomerManager customerManager, Customer customer, Scanner scanner) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Update Contact Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Transfer Money");
            System.out.println("7. Apply for Loan");
            System.out.println("8. Repay Loan");
            System.out.println("9. Exit Customer Menu");

            int customerChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (customerChoice) {
                case 1:
                    System.out.print("Enter new contact information: ");
                    String newContact = scanner.nextLine();
                    customer.updateContact(newContact);
                    System.out.println("Contact information updated successfully!");
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customer.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    if (customer.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance or account is blocked.");
                    }
                    break;

                case 4:
                    System.out.println("Your balance: Rs. " + customer.getBalance());
                    if (customer.isBlocked()) {
                        System.out.println("Your account is blocked.");
                    } else {
                        System.out.println("Your account is not blocked.");
                    }
                    break;

                case 5:
                    customer.printTransactionHistory();
                    break;

                case 6:
                    System.out.print("Enter recipient username: ");
                    String recipientUsername = scanner.nextLine();
                    System.out.print("Enter the amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    boolean success = customerManager.transferMoney(customer.getUsername(), recipientUsername,
                            transferAmount);
                    if (success) {
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed. Check recipient username or insufficient balance.");
                    }
                    break;

                case 7:
                    System.out.print("Enter the loan amount: ");
                    double loanAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customerManager.applyForLoan(customer.getUsername(), loanAmount);
                    System.out.println("Loan application submitted!");
                    break;

                case 8:
                    System.out.print("Enter the loan repayment amount: ");
                    double repaymentAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    customerManager.repayLoan(customer.getUsername(), repaymentAmount);
                    System.out.println("Loan repayment successful!");
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

