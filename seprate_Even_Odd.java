
public class Main {

    static void separateEvenOdd(int arr[]) {

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create separate arrays
        int even[] = new int[evenCount];
        int odd[] = new int[oddCount];

        int e = 0;
        int o = 0;

        // Store even and odd elements
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even[e] = arr[i];
                e++;
            } else {
                odd[o] = arr[i];
                o++;
            }
        }

        // Print even elements
        System.out.print("Even elements: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }

        // Print odd elements
        System.out.print("\nOdd elements: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 15, 20, 25, 30, 35, 40};

        separateEvenOdd(arr);
    }
}
