// 21. Write a Java program to check whether a given string starts with the contents of another string
import java.util.Scanner;
class Program21{
    public static void main(String args[]){
        String s1 = "shubh is very innocent ";
        String s2 = "Rahul is very smart ";
        String s3 []= s1.split("");
        String s4 [] = s2.split("");
        boolean flag = false;
        for(int i=0; i<s3.length; i++){
            if(s3[i].equals(s4[0])){
                flag = true;
                break;
            }

        }
        if(flag){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
