public class sol25 {
      //Write a program to convert state of Long instance into byte, short, int, long, float and double.

      public static void main(String[] args) {
        float a =500.05f;
        Float fl =new Float(a);

        //float to byte 
        byte b1 = fl.byteValue();
        System.out.println("float to byte conversion = "+b1);
        System.out.println();

          //float to short 
          short b2 = fl.shortValue();
          System.out.println("float to short conversion = "+b2);
          System.out.println();

            //float to int
        int b3 = fl.intValue();
        System.out.println("float to integer conversion = "+b3);
        System.out.println();

          //float to long 
          long b4 = fl.longValue();
          System.out.println("float to long conversion = "+b4);
          System.out.println();

            //float to float
        float b5 = fl.floatValue();
        System.out.println("float to float conversion = "+b5);
        System.out.println();

          //float to double 
          double b6 = fl.doubleValue();
          System.out.println("float to double conversion = "+b6);
          System.out.println();


        
    }
    
}
