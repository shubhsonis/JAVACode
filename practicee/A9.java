import java.util.Scanner;

class sub{
    private String str;
    public sub (String str){
        this.str = str;
    }
    public void s(){
        
        String [] arr = str.split("");
        //char [] ch = arr[i].tocharArray();
        for(int i=0; i<arr.length; i++){
            char [] ch = arr[i].tocharArray();
            if(ch[0]>90){
                ch[0] = (char)(ch[0]-32);
                System.out.println(ch[0]);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ");
        String str = sc.nextLine();
        sub obj = new sub(str);
        obj.s();
    }
}

