public class Main {

    // Method to print Fibonacci series
    static void fibonacci(int n) {

        // First two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Variable to store next number
        int c;

        for (int i = 0; i < n; i++) {

            // Print current Fibonacci number
            System.out.println(a);

            // Calculate next Fibonacci number
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        fibonacci(5);
        
    }
}
