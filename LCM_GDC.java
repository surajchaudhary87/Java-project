import java.util.Scanner;


public class Main {

    static void LCM_GDC(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = 1;

        // Finding GCD
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        // Finding LCM
        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }

    public static void main(String[] args) {

       LCM_GDC();

    }
}
