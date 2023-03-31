import java.util.*;
public class sol18 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();    
    int sum =Integer.sum( a, b);
    System.out.println(sum);
    int min=Integer.max(a, b);
    System.out.println(min);
    int max=Integer.min(a, b);
    System.out.println(max);

    }
}
