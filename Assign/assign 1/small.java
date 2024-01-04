class Small1 {
   public static void main(String[] args) {
      byte a = 15, b = 18, c = 19;

      byte sam = (a < b && a < c) ? a : (b < c) ? b : c;
      System.out.println("Small No :" + sam);

   }

}
