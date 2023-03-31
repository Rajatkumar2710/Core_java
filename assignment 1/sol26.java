import java.util.*;

public class sol26 {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float sum=Float.sum(a,b);
        System.out.println(sum);
        float max=Float.max(a,b);
        System.out.println(max);
        Float min=Float.min(a,b);
        System.out.println(min);
    }
}
