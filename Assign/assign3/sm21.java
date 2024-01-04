class A21{
    public static void main(String[] args){
        int length=15,breadth=8,height=5, l=15,b=10,h=8;
        int vob = (length*breadth*height);
        //Convert meter to cm = meter*100
        int cml=(l*100), cmb=(b*100), cmh=(h*100);
        int x = (cml*cmb*cmh)/vob; // Number of brick's
        System.out.println("Volume of Brick " +vob);
        System.out.println("wall of volume " +cml, +cmb, +cmh);
        System.out.println("The number of Brick's " +x);
    }
} 





    
