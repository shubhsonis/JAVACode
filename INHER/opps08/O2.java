import java.util.Scanner;

class Dogs {
      private String name;
      private String breed;

      Dogs(String name, String breed) {
            this.name = name;
            this.breed = breed;
      }

      Dogs() {

      }

      void setName(String name) {
            this.name = name;
      }

      void setBreed(String breed) {
            this.breed = breed;
      }

      void show() {
            System.out.println(" Enter Details : ");
            System.out.println("Dog name : " + name);
            System.out.println("Breed name : " + breed);
      }

}

public class O2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of Dog : ");
            String name = sc.nextLine();
            System.out.println("Enter the breed : ");
            String breed = sc.nextLine();
            Dogs obj = new Dogs(name, breed);
            obj.show();
            System.out.println("Do you want to change the name or breed of dog Press 'yes' otherwise press 'no': ");
            String choice = sc.next();
            if (choice.equals("yes")) {
                  System.out.println("Enter 1 for change the name of dog ");
                  System.out.println("Enter 2 for change the breed of dog : ");
                  System.out.println("Enter 3 for changing the both : ");
                  int c = sc.nextInt();
                  switch (c) {
                        case 1: {
                              System.out.println("Enter the updated name of the dog : ");
                              String updatedname = sc.next();
                              obj.setName(updatedname);
                              obj.show();
                              break;

                        }
                        case 2: {
                              System.out.println("Enter the updated breed of the dog : ");
                              String updatedbreed = sc.next();
                              obj.setBreed(updatedbreed);
                              obj.show();
                              break;
                        }
                        case 3: {
                              System.out.println("Enter the both name and breed of the dog : ");
                              String upname = sc.next();
                              String upbreed = sc.next();
                              Dogs obj1 = new Dogs(upname, upbreed);
                              obj1.show();
                              break;

                        }

                  }
            }
      }

}
