/* The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
farmula : breadth = (p/2)-l
         area =  breadth*lenght */   
class Rectan{
    public static void main(String[] args){
        float per= 230f, length= 70f, width, area;
           width = (per/2f)-length;
        System.out.println("width is : " +width);
           area = (width*length);
        System.out.println("Area is : " +area);    
    }

} 