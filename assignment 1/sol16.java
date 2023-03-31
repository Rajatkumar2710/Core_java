public class sol16 {
   /*  a. int value into String
    b. int value into Integer instance.
    c. String instance into Integer instance.
    d. int value into binary, octal and hexadecimal string.*/

    public static void main1(String[] args) {
        //sol a
        int a= 234;
        String str=Integer.toString(a);
        System.out.println("String : "+str);
        
    }
    //sol b
    public static void main2(String[] args) {
        int a=234;
        Integer in=new Integer(a);
        int it=in.intValue();
        System.out.println("Integer value : "+it);
    }
    //c
    public static void main3(String[] args) {
       String str="567";
       String st=new String(str);
       int in=Integer.parseInt(st);
       Integer it=new Integer(in);
       int ie=it.intValue();
       System.out.println("Integer val :"+ie); 
    }
    //d
    public static void main(String[] args) {
        int a =456;
        String bi=Integer.toBinaryString(a);
        String oc=Integer.toOctalString(a);
        String he=Integer.toHexString(a);
        System.out.println(bi);
        System.out.println(oc);
        System.out.println(he);

    }


    
}
