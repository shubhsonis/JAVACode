class Area{
    private int l, w;
    public void setData(int l, int w){
        this.l = l;
        this.w = w;
    }
    public int getArea(){
        return l*w;
    }
}
class volume extends area{
    protected int h;
    public void setData(int l, int w, int h){
        setData (l,w);
        this.h= h;
    }
    public int getvolume(){
        return 
        getArea()*h;
    }
}
class Test{
    public static void main(String args[]){
    volume v = new volume ();
    v.setData(2,3,4);
    System.out.println(v.getArea());
    System.out.println(v.getvolume());
    }
}
