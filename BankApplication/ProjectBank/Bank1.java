// Dear Team member,
// You have to create Banking application for the admin and user.
// Admin should have following funtionality.
//   1. Admin Login
//   2. Admin can manage customer account
//        Create new customer account
//        View particular account information
//        Remove/Block account
//        View all account list
// Customer should have following functionality
//   1. Customer login
//   2. Update/View account Details
//   3. Apply for loan
//   4. View loan statement.
//   5. Transfer Money
//   6. Transaction History
// Note:- Use File Handling to store the data.  
// First you have to design this system on paper. You can also add some new functionality if required .Above requirement is only general idea. 
// You have to complete above task in team
// also you have prepare the presentation 
// plz acknowledge
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

class Customer1 implements Serializable {
    private String username, password, name, email, address, Adharno, pan, accountno, contact;
    private int age;
    private double balance, loan;
    private boolean isBlocked;
    private static final transient long serialVersionUID = -4846592237034312377L;
    static String BackgroundWhite = "\u001b[47m", Black = "\u001b[30m", Red = "\u001b[31m", Reset = "\u001b[0m";

    public Customer1(String username, String password, String name, String email, String address, String adharno,
            String pan, String accountno, String contact, int age, double balance, double loan, boolean isBlocked) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        Adharno = adharno;
        this.pan = pan;
        this.accountno = accountno;
        this.contact = contact;
        this.age = age;
        this.balance = balance;
        this.loan = loan;
        this.isBlocked = isBlocked;
    }

    public Customer1() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdharno() {
        return Adharno;
    }

    public void setAdharno(String adharno) {
        Adharno = adharno;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getLoan() {
        return loan;
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

    public String getAccountno() {
        return accountno;
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

    public void setblock(boolean block) {
        isBlocked = block;
    }

    public boolean login(String name, String password) {
        try {

            Customer1 o = readFromFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + name + ".txt"));
            return (name.equals(o.getUsername()) && password.equals(o.getPassword()) && o.isBlocked());

        } catch (Exception e) {
            // e.printStackTrace();
            return false;
        }
    }

    public void ApplyforLoan(double loanamount, String username) {
        try {
            double balance;
            File oldfile = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + username + ".txt");

            Customer1 b = readFromFile(oldfile);
            if (username.equals(b.getUsername())) {
                balance = b.getBalance() + loanamount;
                b.setBalance(balance);
                b.setLoan(loanamount);
            }

            writeToFile(oldfile, b);
            System.out.println("Loan Approved......");
            b.toTransactionFile(username, "Loan am", loanamount);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // public void deposit(double amount, String username) {
    // try {
    // double balance;
    // File oldfile = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers"
    // + username + ".txt");
    // if (oldfile.exists()) {

    // Customer1 b = readFromFile(oldfile);
    // balance = b.getBalance() + amount;
    // b.setBalance(balance);
    // System.out.println("Your balance : " + b.getBalance());

    // writeToFile(oldfile, b);
    // System.out.println("Deposit Successfully......");
    // b.toTransactionFile(username, "Debited", amount);
    // } else {
    // System.out.println(Red + "**Account not found**" + Reset);
    // }

    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // public void Withdraw(double amount, String username) {
    // try {
    // double balance;
    // File oldfile = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers"
    // + username + ".txt");

    // Customer1 b = readFromFile(oldfile);
    // if (b.getBalance() >= 1000 && amount <= b.getBalance()) {
    // balance = b.getBalance() - amount;
    // b.setBalance(balance);
    // System.out.println("Your Balance : " + b.getBalance());
    // writeToFile(oldfile, b);
    // System.out.println("Withdraw Successfully......");
    // b.toTransactionFile(username, "Created", amount);

    // } else {
    // System.out.println(Red + "\n**Insufficient Balance**" + Reset);
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    public void UpdateDetail(String username, Scanner sc) {
        try {
            System.out.println("What do you want to update");
            System.out.println("1. Name     " + "\t2. Contact ");
            System.out.println("3. Adress   " + "\t4. Email   ");
            System.out.println("");
            System.out.println("---------------------------------------------");
            int num = sc.nextInt();

            Customer1 b = readFromFile(
                    new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"));
            while (true) {
                if (num == 1) {
                    System.out.println("Enter the name you want to change");
                    boolean flag = true;
                    while (flag) {
                        name = sc.nextLine();
                        char ch[] = name.toCharArray();
                        for (int i = 0; i < ch.length; i++) {
                            if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                    || ch[i] == '4'
                                    || ch[i] == '5' || ch[i] == '6'
                                    || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                flag = true;
                                System.out.println(Red + "***You can't enter integer no.***" + Reset);
                                break;
                            } else {
                                flag = false;
                                continue;
                            }
                        }
                    }
                    b.setName(name);
                    System.out.println("Update Successfully........");
                    b.writeToFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"),
                            b);
                    break;
                } else if (num == 2) {
                    System.out.print("Enter the contact you want to change ");
                    String contact = sc.next();
                    while (true) {
                        boolean flag5 = true;
                        if (contact.length() == 10) {
                            char ch[] = contact.toCharArray();
                            for (int i = 0; i < ch.length; i++) {
                                if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                        || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                                        || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                    continue;
                                } else {
                                    System.out.println(
                                            Red + "**Please enter only number**" + Reset);
                                    flag5 = false;
                                    break;
                                }
                            }
                            if (!flag5) {
                                contact = sc.next();
                            } else {
                                break;
                            }
                        } else {
                            System.out.println(
                                    Red + "**Contact number must be equal 10 digit**" + Reset);
                            contact = sc.next();
                        }
                    }
                    b.setContact(contact);
                    System.out.println("Update Successfully........");
                    b.writeToFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"),
                            b);
                    break;
                } else if (num == 3) {
                    System.out.println("Enter address you want to change");
                    sc.nextLine();
                    String address = sc.nextLine();
                    b.setAddress(address);
                    System.out.println("Update Successfully........");
                    b.writeToFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"),
                            b);
                    break;
                } else if (num == 4) {
                    System.out.println("Enter email you want to change");
                    String email = sc.next();
                    b.setEmail(email);
                    System.out.println("Update Successfully........");
                    b.writeToFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"),
                            b);
                    break;
                } else {
                    System.out.println(Red + "**Please select an option**" + Reset);
                    num = sc.nextInt();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewaccountdetail(String username) {
        try {
            System.out.println("");

            Customer1 o = new Customer1();
            o = o.readFromFile(new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt"));
            if (username.equals(o.getUsername())) {
                System.out.println("Customer name       : " + o.getName());
                System.out.println("Customer age        : " + o.getAge());
                System.out.println("Customer address    : " + o.getAddress());
                System.out.println("Customer addhar no. : " + o.getAdharno());
                System.out.println("Customer pan no.    : " + o.getPan());
                System.out.println("Customer email      : " + o.getEmail());
                System.out.println("Customer account no.: " + o.getAccountno());
                System.out.println("Customer contact    : " + o.getContact());
                System.out.println("Customer balance    : " + o.getBalance());
                System.out.println("Customer username   : " + o.getUsername());
                if (o.getLoan() > 0) {
                    System.out.println("Loan Status      : " + o.getLoan());
                } else {
                    System.out.println("No Loan");
                }
                if (o.isBlocked()) {
                    System.out.println("Account is unblock");
                } else {
                    System.out.println("Account is block");
                }
            } else {
                System.out.println(Red + "**No Account**" + Reset);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Transfermoney(String username, Scanner sc) {
        try {
            File file = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username + ".txt");
            if (file.exists()) {
                System.out.println("Please enter some detail");
                int i = 3;
                String username1 = "";
                while (i != 0) {
                    System.out.println("Enter Customer's username ");
                    username1 = sc.next();
                    if (username.equals(username1)) {
                        System.out.println("You can't transfer money to self account");
                        i--;
                        System.out.println("Now you have only " + i + " attempt left");
                    } else
                        break;
                }

                System.out.println("Enter Customer's account no.");
                String accountno = sc.next();
                while (true) {
                    boolean flag6 = true;
                    if (accountno.length() == 12) {
                        char ch[] = accountno.toCharArray();
                        for (i = 0; i < ch.length; i++) {
                            if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                    || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                                    || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                continue;
                            } else {
                                System.out.println(
                                        Red + "**Please enter only number**" + Reset);
                                flag6 = false;
                                break;
                            }
                        }
                        if (!flag6) {
                            accountno = sc.next();
                        } else {
                            break;
                        }
                    } else {
                        System.out.println(
                                Red + "**Aadhar number must be equal 12 digit**" + Reset);
                        accountno = sc.next();
                    }
                }

                File file2 = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + username1 + ".txt");
                if (file2.exists()) {
                    System.out.println("Enter amount for Transfer");
                    double amount = sc.nextDouble();

                    Customer1 s = this.readFromFile(file);
                    double balance;
                    if (amount <= s.getBalance()) {

                        Customer1 b = this.readFromFile(file2);

                        if (accountno.equals(b.getAccountno()) && b.isBlocked()) {
                            balance = s.getBalance() - amount;
                            s.setBalance(balance);
                            writeToFile(file, s);

                            s.toTransactionFile(s.getUsername(), "Debited", amount);
                            balance = b.getBalance() + amount;
                            b.setBalance(balance);

                            writeToFile(file2, b);
                            b.toTransactionFile(b.getUsername(), "Credited", b.getBalance());
                            System.out.println("Money Transfer Successfully......");
                        } else {
                            System.out.println(Red + "**Your account no. is incorrect**" + Reset);
                        }
                    } else {
                        System.out.println(Red + "**Insufficient Balance**" + Reset);
                    }

                } else {
                    System.out.println(Red + "**Account Not Found**" + Reset);
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void writeToFile(File f, Customer1 b) {
        try {
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(b);
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public Customer1 readFromFile(File f) {
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Customer1 b = (Customer1) ois.readObject();
            ois.close();

            return b;
        } catch (Exception e) {
            // e.printStackTrace();
            return null;
        }

    }

    public void toTransactionFile(String username, String transaction, double amount) {
        try {
            File transFile = new File(
                    "C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + username + "Transfer.txt");

            if (!transFile.exists())
                transFile.createNewFile();

            long lastTime = transFile.lastModified();
            SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            String formattedDate = sd.format(new Date(lastTime));

            FileWriter fw = new FileWriter(transFile, true);
            fw.write(BackgroundWhite + Black + formattedDate + "        " + transaction + "            " + amount
                    + "        " + this.balance
                    + "    " + Reset + "\n");

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void formTransactionFile(String userName) {
        try {
            System.out.println(BackgroundWhite + Black
                    + "----------------------------------------------------------------------" + Reset);
            System.out.println(BackgroundWhite + Black
                    + "Date                      Cr./Dr.             Amount       Ava.Balance" + Reset);
            System.out.println(BackgroundWhite + Black
                    + "----------------------------------------------------------------------" + Reset);

            FileReader fr = new FileReader(
                    "C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers" + userName + "Transfer.txt");
            String data = "";
            while (true) {
                int x = fr.read();
                if (x == -1) {
                    break;
                }
                data = data + (char) x;
            }
            System.out.println(data);
            fr.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}

class Admin1 {
    private static final String Admin1_username = "mahi";
    private static final String Admin1_password = "mahi@07";

    public boolean login(String username, String password) {
        return username.equals(Admin1_username) && password.equals(Admin1_password);
    }

    public void tocreateaccount(Customer1 obj) {
        try {
            File f = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + obj.getUsername() + ".txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            obj.writeToFile(f, obj);
            System.out.println("\n~~~Account Create Successfully~~~");

            obj.toTransactionFile(obj.getUsername(), "Debited", obj.getBalance());

        } catch (Exception e) {
            System.out.println(Customer1.Red + "***Something went wrong" + Customer1.Reset);
        }
    }

    public void viewaccountdetail() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter customer's username");
            String username = sc.nextLine();

            System.out.println("");
            File file = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + username + ".txt");
            if (file.exists()) {

                Customer1 o = new Customer1();
                o = o.readFromFile(file);
                if (username.equals(o.getUsername())) {
                    System.out.println("Customer name       : " + o.getName());
                    System.out.println("Customer age        : " + o.getAge());
                    System.out.println("Customer address    : " + o.getAddress());
                    System.out.println("Customer aadhar no. : " + o.getAdharno());
                    System.out.println("Customer pan card   : " + o.getPan());
                    System.out.println("Customer email      : " + o.getEmail());
                    System.out.println("Customer account no.: " + o.getAccountno());
                    System.out.println("Customer contact    : " + o.getContact());
                    System.out.println("Customer balance    : " + o.getBalance());
                    System.out.println("Customer username   : " + o.getUsername());
                    if (o.getLoan() > 0) {
                        System.out.println("Loan Status         : " + o.getLoan());
                    }
                    if (o.isBlocked()) {
                        System.out.println("Account Unblock");
                    } else {
                        System.out.println("Account Block");
                    }

                } else {
                    System.out.println(Customer1.Red + "**No Account**" + Customer1.Reset);
                }
            } else {
                System.out.println(Customer1.Red + "**Account Not Found**" + Customer1.Reset);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAllAccountDetails() {
        try {
            File directory = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers");
            File[] fileArray = directory.listFiles();

            if (fileArray != null) {
                for (File file : fileArray) {
                    try (FileInputStream fi = new FileInputStream(file);
                            ObjectInputStream oi = new ObjectInputStream(fi)) {
                        Object obj = oi.readObject();

                        if (obj instanceof Customer1) {
                            Customer1 customer = (Customer1) obj;
                            System.out.println("Customer name       : " + customer.getName());
                            System.out.println("Customer age        : " + customer.getAge());
                            System.out.println("Customer address    : " + customer.getAddress());
                            System.out.println("Customer aadhar no. : " + customer.getAdharno());
                            System.out.println("Customer account no.: " + customer.getAccountno());
                            System.out.println("Customer email      : " + customer.getEmail());
                            System.out.println("Customer contact    : " + customer.getContact());
                            System.out.println("Customer username   : " + customer.getUsername());
                            System.out.println("Customer balance    : " + customer.getBalance());
                            if (customer.getLoan() > 0) {
                                System.out.println("Loan Status       : " + customer.getLoan());
                            }

                            String block = (customer.isBlocked()) ? "not" : "";
                            System.out.println("Account is " + block + " blocked");
                            System.out.println();
                        } else {
                            System.out.println("File does not contain a valid Customer object: " + file.getName());
                        }
                    } catch (Exception e) {
                        System.err.println("Error reading file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("No files found in the specified directory.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RemoveBlockAccount(int choice, Scanner sc) {
        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter customer username ");
                    String name = sc.next();
                    File f = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + name + ".txt");
                    File file = new File(
                            "C:\\Users\\hp\\Desktop\\java\\BankApplication\\Transaction\\" + name + "Transfer.txt");
                    if (f.exists() && file.exists()) {
                        f.delete();
                        file.delete();
                    } else {
                        System.out.println("Account is not exists");
                    }
                    break;

                case 2:
                    System.out.println("Enter username ");
                    String name1 = sc.next();

                    System.out.println("");
                    f = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + name1 + ".txt");
                    Customer1 o = new Customer1();
                    o = o.readFromFile(f);
                    if (o.isBlocked()) {
                        o.setblock(false);
                        o.writeToFile(f, o);
                        System.out.println("Account Block Successfully.........");
                    } else {
                        System.out.println("Account is already block");
                    }
                    break;

                case 3:
                    System.out.println("Enter username ");
                    String name2 = sc.next();

                    System.out.println("");
                    Customer1 c = new Customer1();
                    f = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers\\" + name2 + ".txt");
                    c = c.readFromFile(f);
                    if (!c.isBlocked()) {
                        c.setblock(true);
                        c.writeToFile(f, c);
                        System.out.println("Account UnBlock Successfully.........");

                    } else {
                        System.out.println("Account is already unblock");
                    }
                    break;

                default:
                    System.out.println(Customer1.Red + "***Please enter valid option" + Customer1.Reset);
                    break;

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Red = "\u001b[31m", Reset = "\u001b[0m", Yellow = "\u001b[33m", Blue = "\u001b[34m",
                Magenta = "\u001b[35m", Cyan = "\u001b[36m";
        System.out.println(Yellow + "\n~~~Welcome to Banking Application~~~" + Reset);
        Customer1 obj = new Customer1();
        Admin1 ad = new Admin1();
        boolean flag = true;
        while (flag) {
            System.out.println(Magenta + "\n----------------------------------------" + Reset);
            System.out.println("Please select an option:");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.println(Magenta + "\n----------------------------------------" + Reset);
            int choice = -1;
            while (true) {
                try {
                    choice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(Red + "**Please enter only integer**" + Reset);
                    sc.next();

                }

            }
            switch (choice) {
                case 1:
                    System.out.println(Cyan + "------------------Admin Login-----------------" + Reset);
                    System.out.print("Enter Admin username : ");
                    String username = sc.next();
                    System.out.print("Enter Admin password : ");
                    String password = sc.next();
                    if (ad.login(username, password)) {
                        System.out.println("\nAdmin Login Successfully......");
                        boolean flag1 = true;
                        while (flag1) {

                            System.out.println(Cyan + "---------------------------------------" + Reset);
                            System.out.println(Magenta + "~~~~~~~~~~~~~ADMIN MENU~~~~~~~~~~~~~~  " + Reset);

                            System.out.println("Enter : 1 for Create Account"
                                    + "\nEnter : 2 for view particular account"
                                    + "\nEnter : 3 for view allaccount detail"
                                    + "\nEnter : 4 for Remove/Block account"
                                    + "\nEnter : 5 for Exit");
                            System.out.println(Cyan + "---------------------------------------" + Reset);
                            int choice1 = -1;
                            while (true) {
                                try {
                                    choice1 = sc.nextInt();
                                    break;
                                } catch (Exception e) {
                                    // TODO: handle exception
                                    System.out.println(Red + "**Please enter only integer**" + Reset);
                                    sc.next();
                                }
                            }

                            switch (choice1) {
                                case 1:
                                    System.out.println(Cyan + "----------------Create Account----------------" + Reset);
                                    boolean flag7 = true;
                                    String name = "";
                                    sc.nextLine();
                                    while (flag7) {
                                        System.out.print("Enter new customer's name         : ");
                                        name = sc.nextLine();

                                        char ch[] = name.toCharArray();
                                        for (int i = 0; i < ch.length; i++) {
                                            if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                                    || ch[i] == '4'
                                                    || ch[i] == '5' || ch[i] == '6'
                                                    || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                                flag7 = true;
                                                System.out.println(Red + "***You can't enter integer no.***" + Reset);
                                                break;
                                            } else {
                                                flag7 = false;
                                                continue;
                                            }
                                        }
                                    }
                                    int age;
                                    while (true) {
                                        try {
                                            System.out.print("Enter new customer's age          : ");
                                            age = sc.nextInt();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println(Red + "**Please enter only integer**" + Reset);
                                            sc.next();
                                        }
                                    }
                                    if (age >= 15 && age <= 70) {

                                        System.out.print("Enter new customer's contact      : ");
                                        String contact = sc.next();
                                        while (true) {
                                            boolean flag5 = true;
                                            if (contact.length() == 10) {
                                                char ch[] = contact.toCharArray();
                                                for (int i = 0; i < ch.length; i++) {
                                                    if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                                            || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                                                            || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                                        continue;
                                                    } else {
                                                        System.out.println(
                                                                Red + "**Please enter only number**" + Reset);
                                                        flag5 = false;
                                                        break;
                                                    }
                                                }
                                                if (!flag5) {
                                                    contact = sc.next();
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                System.out.println(
                                                        Red + "**Contact number must be equal 10 digit**" + Reset);
                                                contact = sc.next();
                                            }
                                        }

                                        System.out.print("Enter new customer's address      : ");
                                        sc.nextLine();
                                        String address = sc.nextLine();

                                        System.out.print("Enter new customer's aadhar no.   : ");
                                        String aadhar = sc.next();
                                        while (true) {
                                            boolean flag6 = true;
                                            if (aadhar.length() == 12) {
                                                char ch[] = aadhar.toCharArray();
                                                for (int i = 0; i < ch.length; i++) {
                                                    if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                                                            || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                                                            || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                                                        continue;
                                                    } else {
                                                        System.out.println(
                                                                Red + "**Please enter only number**" + Reset);
                                                        flag6 = false;
                                                        break;
                                                    }
                                                }
                                                if (!flag6) {
                                                    aadhar = sc.next();
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                System.out.println(
                                                        Red + "**Aadhar number must be equal 12 digit**" + Reset);
                                                aadhar = sc.next();
                                            }
                                        }

                                        System.out.print("Enter new customer pan no.        : ");
                                        String pan = sc.next();
                                        while (true) {
                                            if (pan.length() == 6) {
                                                break;
                                            } else {
                                                System.out.println("**Pan card must be equal 6 digit**");
                                                pan = sc.next();
                                            }
                                        }

                                        System.out.print("Enter new customer's email        : ");
                                        String email = sc.next();

                                        String username1 = "";
                                        while (true) {
                                            System.out.print("Enter new customer's username     : ");
                                            username1 = sc.next();

                                            File f = new File("C:\\Users\\hp\\Desktop\\java\\BankApplication\\Customers");

                                            flag = true;
                                            String[] files = f.list();
                                            for (String file : files) {
                                                if (file.equals(username1 + ".txt")) {
                                                    System.out.println(Red + "**Username is already taken**" + Reset);
                                                    flag = false;
                                                    break;
                                                }
                                            }
                                            if (flag)
                                                break;
                                        }

                                        System.out.print("Enter new customer's password     : ");
                                        String pass = sc.next();

                                        long min = 100000000000l, max = 999999999999l;
                                        long accountno = (long) (Math.random() * (max - min + 1) + min);

                                        double balance = 0.0;

                                        System.out.println("What account do you want to open ");
                                        int num = -1;
                                        while (true) {
                                            try {
                                                System.out.println("\nFor Current account press : 1"
                                                        + "\tFor Saving account press : 2");
                                                num = sc.nextInt();
                                                if (num == 1 || num == 2) {
                                                    break;
                                                } else {
                                                    System.out
                                                            .println(Red + "**Please select right option**" + Reset);

                                                }
                                            } catch (Exception e) {
                                                System.out.println(Red + "**Please enter only integer**" + Reset);
                                                sc.next();
                                            }
                                        }

                                        switch (num) {
                                            case 1:
                                                while (true) {
                                                    try {

                                                        System.out.println(
                                                                "Enter initial balance(it must be 5000 or more : ");
                                                        balance = sc.nextDouble();

                                                        if (balance >= 5000) {
                                                            break;
                                                        } else {
                                                            System.out.println(
                                                                    Red + "**Initial Balance must be greater than 5000**"
                                                                            + Reset);
                                                            System.out.println("Do you want to continue Y/N :");
                                                            char c = sc.next().charAt(0);
                                                            if(c=='N'||c=='n'){
                                                                break;
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        System.out.println(
                                                                Red + "**Please enter only integer**" + Reset);
                                                        sc.next();
                                                    }
                                                }
                                                break;
                                            case 2:
                                                while (true) {
                                                    try {
                                                        System.out.println(
                                                                "Enter initial balance(it must be 1000 or more : ");
                                                        balance = sc.nextDouble();

                                                        if (balance >= 1000) {
                                                            break;
                                                        } else {
                                                            System.out.println(
                                                                    Red + "**Initial Balance must be greater than 1000**"
                                                                            + Reset);
                                                        }
                                                    } catch (Exception e) {
                                                        System.out.println(
                                                                Red + "**Please enter only integer**" + Reset);
                                                        sc.next();
                                                    }
                                                }
                                        }
                                        if(balance!=0){
                                            Customer1 obj1 = new Customer1(username1, pass, name, email, address,
                                                    aadhar, pan, ("" + accountno), contact,
                                                    age, balance, 0, true);
    
                                            ad.tocreateaccount(obj1);
                                        }
                                    } else {
                                        System.out
                                                .println(Red + "**You are not eligible to open an account**" + Reset);
                                    }
                                    break;

                                case 2:
                                    System.out.println(
                                            Cyan + "-------------Customer Account Detail--------------" + Reset);
                                    ad.viewaccountdetail();
                                    break;

                                case 3:
                                    System.out.println(
                                            Cyan + "------------All Customer Account Detail------------" + Reset);
                                    ad.viewAllAccountDetails();
                                    break;

                                case 4:
                                    try {
                                        System.out.println(
                                                Cyan + "-------------Remove/Block Detail--------------" + Reset);
                                        System.out.println("Enter : 1 for Remove " + "\nEnter : 2 for Block"
                                                + "\nEnter : 3 for UnBlock");
                                        System.out.println(
                                                Cyan + "----------------------------------------------" + Reset);
                                        int choice3 = sc.nextInt();
                                        ad.RemoveBlockAccount(choice3, sc);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;

                                case 5:
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println(Red + "**Please select an option**" + Reset);
                            }
                        }
                    } else {
                        System.out.println(Red + "***Admin1 login failed. Please try again.***" + Reset);
                    }
                    break;

                case 2:
                    System.out.println(Magenta + "-------------Customer Login-------------" + Reset);
                    System.out.print("Enter username : ");
                    String username1 = sc.next();

                    System.out.print("Enter password : ");
                    String password1 = sc.next();
                    boolean flag2 = true;
                    if (obj.login(username1, password1)) {
                        System.out.println("Customer1 Login Successfully......");
                        while (flag2) {
                            System.out
                                    .println(Magenta + "----------------------------------------------------" + Reset);
                            System.out.println(Cyan + "~~~~~~~~~~~~~~Customer menu~~~~~~~~~~~~~" + Reset);
                            // System.out.println("1. Withdraw money " + "\t2. Deposit money");
                            System.out.println("1. View Account Detail  " + "\t2. Apply for loan");
                            System.out.println("3. Update Details       " + "\t4. Transaction History");
                            System.out.println("5. Transfer money       " + "\t6. Exit");
                            System.out
                                    .println(Magenta + "----------------------------------------------------" + Reset);

                            int choice2 = -1;
                            while (true) {
                                try {
                                    choice2 = sc.nextInt();
                                    break;
                                } catch (Exception e) {
                                    // TODO: handle exception
                                    System.out.println(Red + "**Please enter only integer**" + Reset);
                                    sc.next();
                                }
                            }

                            switch (choice2) {
                                // case 1:
                                // System.out.println(Magenta + "-------------Withdraw--------------" + Reset);
                                // System.out.println("Enter amount");
                                // double amount = sc.nextDouble();
                                // obj.Withdraw(amount, username1);
                                // break;
                                // case 2:
                                // System.out.println(Magenta + "--------------Deposit---------------" + Reset);
                                // System.out.println("Enter amount");
                                // amount = sc.nextDouble();
                                // while (true) {
                                // if (amount > 0) {
                                // obj.deposit(amount, username1);
                                // break;
                                // } else {
                                // System.out.println(Red + "**Please enter valid amount**" + Reset);
                                // amount = sc.nextDouble();
                                // }
                                // }
                                // break;

                                case 1:
                                    System.out.println(Magenta + "------------Account Detail-------------" + Reset);
                                    obj.viewaccountdetail(username1);
                                    break;

                                case 2:
                                    System.out.println(Magenta + "-----------Apply For Loan--------------" + Reset);
                                    System.out.println("Enter your yearly income");
                                    double Income = sc.nextDouble();

                                    System.out.println("Enter amount of loan");
                                    double loanAmount = sc.nextDouble();

                                    if (Income * 0.7 >= loanAmount) {
                                        obj.ApplyforLoan(loanAmount, username1);
                                    } else {
                                        System.out.println(Red + "**Sorry Your not applicable for loan**" + Reset);
                                    }

                                    break;
                                case 3:
                                    System.out.println(
                                            Magenta + "-----------------Update Details---------------" + Reset);
                                    obj.UpdateDetail(username1, sc);
                                    break;
                                case 4:
                                    System.out.println(
                                            Magenta + "---------------Transaction History------------\n" + Reset);
                                    obj.formTransactionFile(username1);
                                    break;

                                case 5:
                                    System.out.println(
                                            Magenta + "-----------------Transfer Money---------------" + Reset);
                                    obj.Transfermoney(username1, sc);
                                    break;
                                case 6:
                                    flag2 = false;
                                    break;
                                default:
                                    System.out.println(Red + "**Please select a correct option**" + Reset);
                            }
                        }
                    } else {
                        System.out.println(Red + "Customer1 login failed. Please try again." + Reset);
                        break;
                    }
                    break;

                case 3:
                    System.out.println(Blue + "\n************Thanks for Visiting***********\n" + Reset);
                    flag = false;
                    break;
                default:
                    System.out.println(Red + "**Please select a correct option**" + Reset);
            }
        }
    }
}
