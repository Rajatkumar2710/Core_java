//command line input program

import java.util.*;
class ifd{
    static int i1,i2;
    static float f1,f2;
    static double d1,d2;

   

}
class sol33 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner (System.in);
        int choice = 0;

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int a = Integer.parseInt(args[0]);
        if(a==1)        
        {
           ifd.i1 = Integer.parseInt(args[1]);
           ifd.i2 = Integer.parseInt(args[2]);
            choice = sc.nextInt();
        }  
        else
        {
            if(a==2)
            {
            ifd.f1 = Float.parseFloat(args[1]);
            ifd.f2 = Float.parseFloat(args[2]);
            choice = sc.nextInt();
            }
            if(a==3)
            {
            ifd.d1 = Double.parseDouble(args[1]);
            ifd.d2 = Double.parseDouble(args[2]);
            choice = sc.nextInt();
            }
        }
        if(a==1){
        switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            int result =ifd.i1+ifd.i2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            int Substraction = ifd.i1 - ifd.i2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            int Multiplication = ifd.i1 * ifd.i1 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            int Division = ifd.i1 / ifd.i2 ;
            System.out.println(Division);
            break;
        }
    }
        if(a==2){
        switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            float result =ifd.f1+ifd.f2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            float Substraction = ifd.f1 - ifd.f2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            float Multiplication = ifd.f1 * ifd.f2 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            float Division = ifd.f1 / ifd.f2 ;
            System.out.println(Division);
            break;
        }
    }
         if(a==3){
          switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            double result =ifd.d1+ifd.d2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            double Substraction = ifd.d1 - ifd.d2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            double Multiplication = ifd.d1 * ifd.d2 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            double Division = ifd.d1 / ifd.d2 ;
            System.out.println(Division);
            break;
        }
    }
         
        
        
        
    }   
    

}
