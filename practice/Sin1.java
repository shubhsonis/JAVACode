class database{
    String driver = "abc";
    String password = "xyz";
    static database d = new database();
    private database ()
    {

    }
    void show(){
        System.out.println(password);
    }
    public static database getobject(){
         return d;
    }
}
    public class Sin1{
        public static void main(String args[]){
            database t = database.getobject();
            database t1 = database.getobject();
            database t2 = database.getobject();

            System.out.println(t);
            System.out.println(t1);
            System.out.println(t2);
        
        }
    }
