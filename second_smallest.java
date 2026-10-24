
class Main {

    static int secondSmallest(int arr[]) {

        int smallest = arr[0];

        // Find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int second_smallest = Integer.MAX_VALUE;

        // Find the second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest &&
                arr[i] < second_smallest) {

                second_smallest = arr[i];
            }
        }

        return second_smallest;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 2, 5, 10, 35, 28, 56, 89, 54};

        int result = secondSmallest(arr);

        System.out.println("Second smallest element: " + result);
    }
}
