// Calculator.java
import java.util.Scanner;

class Calculator {

    public void cal() {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n========== CALCULATOR ==========");

            System.out.print("Enter first number : ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number : ");
            double num2 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, %) : ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result : " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result : " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result : " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result : " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result : " + result);
                    } else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator.");
            }

            System.out.print("\nDo you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y' );

        sc.close();
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.cal();
    }
}
