public class sol21 {
    
     //Write a program to convert state of Long instance into byte, short, int, long, float and double.

     public static void main(String[] args) {
        long a =500;
        Long lo =new Long(a);

        //long to byte 
        byte b1 = lo.byteValue();
        System.out.println("long to byte conversion = "+b1);
        System.out.println();

          //long to short 
          short b2 = lo.shortValue();
          System.out.println("long to short conversion = "+b2);
          System.out.println();

            //long to int
        int b3 = lo.intValue();
        System.out.println("long to integer conversion = "+b3);
        System.out.println();

          //long to long 
          long b4 = lo.longValue();
          System.out.println("long to long conversion = "+b4);
          System.out.println();

            //long to float
        float b5 = lo.floatValue();
        System.out.println("long to float conversion = "+b5);
        System.out.println();

          //long to double 
          double b6 = lo.doubleValue();
          System.out.println("long to double conversion = "+b6);
          System.out.println();


        
    }
}
