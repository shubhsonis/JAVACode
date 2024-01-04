class A12{
     public static void main(String[] args){
        int hypo = 13, aside = 12; 
        // B side = math.sqrt(h*h-s*s)
        double bside = Math.sqrt((hypo*hypo)-(aside*aside));
        System.out.println("B side = " +bside);
        // Area of right angled triangle = aside*bside/2
        double area = (aside*bside)/2;
        System.out.println("Area of Right angled Triangle " +area);
     }
} 