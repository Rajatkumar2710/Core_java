public class sol9 {
    
        static Byte b1=10;
        public static void main(String[] args) {
            Byte b3 = new Byte(b1);
    
            byte b4 = b3.byteValue();
            System.out.println("Byte to Byte Conversion :"+b4);
            System.out.println();
            // Byte instance to Byte.
            
            short s = b3.shortValue();
            System.out.println("Byte to Short Conversion :"+s);
            System.out.println();
            // Byte instance to Short.
    
            int i = b3.intValue(); 
            System.out.println("Byte To Integer Conversion :"+i);
            System.out.println();
            // Byte instance to integer
    
            long l =b3.longValue();
            System.out.println("Byte to Long Conversion :"+l);
            System.out.println();
            // Byte to long conversion.
    
            float f= b3.floatValue();
            System.out.println("Byte to float Conversion :"+f);
            System.out.println();
            // Byte to float Conversion
    
            double d = b3.doubleValue();
            System.out.println("Byte to Double Conversion :"+d);
            //Byte instance to double conversion.
        }       
    
}
