// 29. Write a Java program to Reverse Each Word of a String
import java.util.Scanner;
class StrReverseWord {
    private String str;
    public StrReverseWord(String str , String arr[]){
        this.str = str;
        for(int i=0;i<arr.length;i++){
            String s = " ";
            for(int j=0;j<arr[i].length();j++){
                char ch = arr[i].charAt(j);
                s = ch + s;
            }
            System.out.print(s);
        }
    }
}
class StrReverseWordMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        new StrReverseWord(str , arr);
    }
}