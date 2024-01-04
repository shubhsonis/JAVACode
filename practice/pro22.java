import java.util.Scanner;

//Import java.util.Scanner;
class ConnvertfirstUpper{
    private String str;
    public ConnvertfirstUpper(String str){
        this.str = str;
    }

    public void convert(){
          String [] arr = str.split(" ");
          for(int i=0; i<arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            if(ch[0]>90) {
                ch[0] = (char) (ch[0]-32);
                String s = new String(ch);
                arr[i] = s;
            }
            System.out.print(arr[i]+ " ");
        }
    }
}

class Test{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Staring ");
        String str = sc.nextLine();

        ConnvertfirstUpper obj = new ConnvertfirstUpper(str);
        obj.convert();
    }
}