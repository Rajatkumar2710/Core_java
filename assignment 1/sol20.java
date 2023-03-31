class sol20 {



    
//part a

    public static void main1(String[] args) {
        long a=12345677L;
        String str=Long.toString(a);
        System.out.println("number long = "+a);
    }

    //part b
    public static void main2(String[]args) {
        
               // primitive
               long val = 45;
               System.out.println("long primitive: "+val);
               // object
               Long myObj = new Long(val);
               System.out.println("Long object: "+myObj);
     
     
            }

    //part c
    public static void main3(String[]args){
        //converting string into string instance
       String str ="234567";
       String n=new String(str);
       System.out.println("String instance = "+n);
       //string instance to long instance
       long number=Long.parseLong(n);
       Long num =new Long(number);
       System.out.println("Long = "+num);

    }
   // part d
    public static void main(String[] args){
        long a =1234567L;
        String bi=Long.toBinaryString(a);
        String oc=Long.toOctalString(a);
        String he=Long.toHexString(a);
        System.out.println("binary = "+bi);
        System.out.println("octal = "+oc);
        System.out.println("hexadecimal = "+he);
    }
         
 }

