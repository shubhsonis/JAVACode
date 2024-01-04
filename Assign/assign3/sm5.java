class A5{
    public static void main(String[] args) {
        int cost=1600,  length=20, rate=25;
        float area= cost/rate;
        float breadth= area/length;
        float peri= 2*(length+breadth);
        System.out.println("Area of park : " +area);
        System.out.println("Per of park :" +peri);
        System.out.println("Breadth of park :" +breadth);
    }
}