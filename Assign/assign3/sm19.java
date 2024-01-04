//Farmula Volume of cube = edge3
// Farmula volume of cuboid = leagth*breadth*height
class A19{
    public static void main(String[] args) {
        int edge=7, leagth=7, breadth=4, height=8;
        int cube = edge*edge*edge;
        int cuboid = leagth*breadth*height;
        System.out.println("Volume of Cube : " +cube);
        System.out.println("Volume of Cuboid " +cuboid);
        if(cube>cuboid){
            System.out.println("Volume of Cube is more then Cuboid");
        }else{
            System.out.println("Volume of Cuboid is more then cube");
        }    
    }
    
}