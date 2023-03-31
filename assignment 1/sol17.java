public class sol17 {
    //Write a program to convert state of Integer instance into byte, short, int, long, float and double.

    public static void main(String[] args) {
        Integer a =500;
        Integer in =new Integer(a);

        //Integer to byte 
        byte b1 = in.byteValue();
        System.out.println("Integer to byte conversion = "+b1);
        System.out.println();

          //Integer to short 
          short b2 = in.shortValue();
          System.out.println("Integer to short conversion = "+b2);
          System.out.println();

            //Integer to int
        int b3 = in.intValue();
        System.out.println("Integer to integer conversion = "+b3);
        System.out.println();

          //Integer to long 
          long b4 = in.longValue();
          System.out.println("Integer to long conversion = "+b4);
          System.out.println();

            //Integer to float
        float b5 = in.floatValue();
        System.out.println("Integer to float conversion = "+b5);
        System.out.println();

          //Integer to double 
          double b6 = in.doubleValue();
          System.out.println("Integer to double conversion = "+b6);
          System.out.println();


        
    }
    
}
