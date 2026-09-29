class Main {

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 50, 7, 10, 6, 10, 30, 40};

        Main obj = new Main();
        obj.sort(arr);
    }
}
