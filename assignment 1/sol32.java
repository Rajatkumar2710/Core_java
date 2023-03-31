//input from command line
public class sol32 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter full name in inverted cotes or string will read first name ");
        } else {
            String fullName = args[0];
            System.out.println("Full name: " + fullName);
        }
    }
}

