class A8{
    public static void main(String[] args) {
        float base, x = 0.8f, altitude = 20;
        // convert area meter to centimeter = 0.8*100= 80 
        float areacm = (x*100);
        
        System.out.println("Area to convert Cm" +areacm);
        base = 2*(areacm/altitude);
        System.out.println("Base = "+base);
    }
}