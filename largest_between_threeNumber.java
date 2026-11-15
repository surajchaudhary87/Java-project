
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest number: " + b);
        } 
        else {
            System.out.println("Largest number: " + c);
        }

        sc.close();
    }
}
