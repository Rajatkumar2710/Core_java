public class sol8 {

     /*a. byte value into String
          b. byte value into Byte instance.
          c. String instance into Byte instance.*/

          //sol a
    public static void main1(String[] args) {
       
        byte a=123;
         String str=Byte.toString(a);
         System.out.println("String = "+str);

        
        }
        //Sol b
        public static void main2(String[] args) {
            byte val =125;
            Byte bs=new Byte(val);
            byte b=bs.byteValue();
            System.out.println("Byte = "+b);
        }
        public static void main(String[] args) {
            String str="125";
            String st=new String(str);
            byte b = Byte.parseByte(st);
            Byte bs = new Byte(b);
            byte c=bs.byteValue();
            System.out.println("Byte val = "+c);

        }
    
}
