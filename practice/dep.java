class Test{
    int x, y;
    public void display(){
        System.out.println(x+ "  "+y);
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.x=10;
        obj.y=20;
        Test.obj1=new Test();
        obj1.x = obj.x;
        obj1.y = obj.y;

        obj.display();
        obj1.display();
    }
}