// 26. Write a Java program to Count words in Given String
import java.util.Scanner;

class StrCountWord {
    private String str;
    int count = 0;
    public StrCountWord(String str){
        String ch[] = str.split(" ");
        this.str = str;
        for(int i=0;i<ch.length;i++){
            String s = ch[i];
            if(s.equals(ch[i]))
                count++;
        }      
    }
    public int display(){
        return count;
    } 
}

class StrCountWordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        StrCountWord obj = new StrCountWord(str);
        System.out.println("Total word in String: "+obj.display());
    }
} 