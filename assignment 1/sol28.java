public class sol28 {

    /*a. double value into String
    b. double value into Double instance.
    c. String instance into Double instance.
    d. double value into binary, octal and hexadecimal 
    string(Note: Here you can use doubleToLongBits() method 
     along with methods of Long class).*/

     //sol a
    public static void main1(String[] args) {
        double d1=56.77788;
        String str=Double.toString(d1);
        System.out.println("String = "+str);
    }
    //sol b
    public static void main2(String[] args) {
        double d1=55.6789;
        Double d2=new Double(d1);
        System.out.println(d2);
    }

    //sol c
    public static void main3(String[] args) {
        String st="56.7899";
        String str = new String(st);
        double d1=Double.parseDouble(str);
        Double d2=new Double(d1);
        System.out.println("Double val = "+d2);

    }
    //sol d
    public static void main(String[] args) {
        double d1= 55.7687;
        Double d2=new Double(d1);
        double d3 =Double.doubleToLongBits(d2);
        String str=Double.toHexString(d3);
        System.out.println(str);
        System.out.println(d3);
        

        
    }
    
}
