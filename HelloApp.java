public class HelloApp {
    public static void main(String[] args) {
        // Check if a command-line argument exists
        if (args.length > 0) {
            // Access the first argument and concatenate
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Default fallback
            System.out.println("Hello, World!");
        }
    }
}