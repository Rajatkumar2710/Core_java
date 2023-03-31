public class sol14 {
    //Write a program to convert state of Short instance into byte, short, int, long, float and double.

    public static void main(String[] args) {
        Short a =200;
        Short sh =new Short(a);

        //Short to byte 
        byte b1 = sh.byteValue();
        System.out.println("Short to byte conversion = "+b1);
        System.out.println();

          //Short to short 
          short b2 = sh.shortValue();
          System.out.println("Short to short conversion = "+b2);
          System.out.println();

            //Short to int
        int b3 = sh.intValue();
        System.out.println("Short to integer conversion = "+b3);
        System.out.println();

          //Short to long 
          long b4 = sh.longValue();
          System.out.println("Short to long conversion = "+b4);
          System.out.println();

            //Short to float
        float b5 = sh.floatValue();
        System.out.println("Short to float conversion = "+b5);
        System.out.println();

          //Short to double 
          double b6 = sh.doubleValue();
          System.out.println("Short to double conversion = "+b6);
          System.out.println();


        
    }
    
}
