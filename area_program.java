
import java.util.Scanner;

// Main class
class Main {

    // 1. Method to calculate the area of a rectangle
    static void areaOfRectangle(int l, int b) {
        int area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }

    // 2. Method to calculate the area of a circle
    static void areaOfCircle(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }

    // 3. Method to calculate the area of a square
    static void areaOfSquare(int a) {
        int area = a * a;
        System.out.println("Area of Square: " + area);
    }

    // 4. Method to calculate the area of a triangle
    static void areaOfTriangle(int b, int h) {
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

    // Main method: Program execution starts here
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input for rectangle
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        // Input for circle
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();

        // Input for square
        System.out.print("Enter side of square: ");
        int a = sc.nextInt();

        // Input for triangle
        System.out.print("Enter base and height: ");
        int base = sc.nextInt();
        int h = sc.nextInt();

        // Calling all four methods
        areaOfRectangle(l, b);
        areaOfCircle(r);
        areaOfSquare(a);
        areaOfTriangle(base, h);

        // Close Scanner
        sc.close();
    }
}
