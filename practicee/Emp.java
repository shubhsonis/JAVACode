class Information{
    private String name,address;
    private int year;

    public Information(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }
    public void display(){
        System.out.println(name+"\t\t"+year+"\t\t"+address);
    }
}
class Emp{
    public static void main(String[] args) {
        
        Information obj1 = new Information("ashish",1994,"wal 64c");
        Information obj2 = new Information("same",2000,"68D-wall");
        Information obj3 = new Information("John",1999,"26b wall");
        
        System.out.println("Name\t Year of Joining\t Address\n");
        obj1.display();
        obj2.display();
        obj3.display();
        
        
    }
}