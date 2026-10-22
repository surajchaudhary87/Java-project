
import java.util.Scanner;

public class Main {

    static void perfect() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        // Check divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check perfect number
        if (num > 0 && sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }

    public static void main(String[] args) {
        perfect();
    }
}
