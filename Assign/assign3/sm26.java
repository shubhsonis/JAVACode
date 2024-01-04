class A26{
    public static void main(String[] args) {
        int l = 24;
        int b = 15;
        int bricks = l * b;
        float path = 120 * 240;
        float totaltiles = path / bricks;
        System.out.println("Total Tiles Required : " + totaltiles);
    }
}
