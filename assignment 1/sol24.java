public class sol24 {
   /*  a. float value into String
       b. float value into Float instance.
       c. String instance into Float instance.
       d. float value into hexadecimal string.*/

       //sol a
    public static void main1(String[] args) {
        float fl=22.5f;
        String str=Float.toString(fl);
        System.out.println("String : "+str);
    }

    //sol b
    public static void main2(String[] args) {
        float fl=22.75f;
    Float fo=new Float(fl);
    float fa = fo.floatValue();
    System.out.println("float num = "+fa);
        
    }
    //sol c
    public static void main3(String[] args) {
        String st="55.678";
        String str=new String(st);
        float fl=Float.parseFloat(str);
        Float fo=new Float(fl);
        System.out.println("float num = "+fo);
        
    }
    //sol d
    public static void main(String[] args) {
        float fl=55.678f;
        String str=Float.toHexString(fl);
        System.out.println("Hex straing = "+str);
    }
   




}
