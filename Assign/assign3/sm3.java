class Tiles{
    public static void main(String[] args) {
        int length = 520, width =140,area,tileslen = 13,tileswidth = 7,z; 
         area = length*width;
        System.out.println("Area of Rec :" +area);
         int tilesarea = (tileslen*tileswidth);
        System.out.println("Area of Tiles : " +tilesarea);
         z = (area/tilesarea);
        System.out.println("Answer is = " +z);

    }
}