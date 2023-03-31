public class sol13 {
   /*  a. short value into String
b. short value into Short instance.
c. String instance into Short instance.*/

// sol a
    public static void main1(String[] args) {
        short sh=125;
        String str=Short.toString(sh);
        System.out.println("String = "+str);

    }
    //sol b
    public static void main2(String[] args) {
        short sh=125;
        Short so=new Short(sh);
        short sr= so.shortValue();
        System.out.println("Short value = "+sr);
    }
    //sol c
    public static void main(String[] args) {
        String str = "126";
        String st = new String(str);
        short sh=Short.parseShort(st);
        Short so = new Short(sh);
        short sr = so.shortValue();
        System.out.println("Short val ="+sr);
    }
    
}
