// 47. Write a program to Convert a character array to string\
import java.util.Scanner;
class ChArrayToStr {
    public ChArrayToStr(char ch[]){
        String str = "";
        for(int i=0;i<ch.length;i++)
            str += ch[i];
        System.out.print(str);
    }
}
class ChArrayToStrMain{
    public static void main(String[] args) {
        char ch[] = {'M' , 'A' , 'H', 'A', 'N', 'K', 'A', 'L'};
        new ChArrayToStr(ch);
    }
}