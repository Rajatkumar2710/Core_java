

class sol6{

    
//part a
    public static void main1(String[] args) {
        boolean a=true;
       // String str= Boolean.toString(a);//approch 1

     String str =String.valueOf(a) ;

        System.out.println(a);
    }
    //part b
    public static void main2(String[] args) {
        boolean b=false;
        Boolean a =new Boolean(b);
        boolean bo=a.booleanValue();
        System.out.println("Boolean value"+bo);         
    
    }
    //case 3
    public static void main3(String[] args) {
       String str="false";
       boolean bo=Boolean.parseBoolean(str); 
       System.out.println("Boolean = "+bo);
    }
    //case 4
    public static void main(String[] args) {
        String str="false";
        Boolean bool=new Boolean(str);
        System.out.println("Boolean val = "+bool);

        

    }


}