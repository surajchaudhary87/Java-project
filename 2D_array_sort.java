class Main {

    static void sort2DArray(int arr[][]) {

        // Count total elements
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }

        // Create 1D array
        int newArr[] = new int[count];

        // Copy 2D array elements into 1D array
        int newCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[newCount++] = arr[i][j];
            }
        }

        // Bubble Sort
        for (int i = 0; i < count - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < count - 1 - i; j++) {

                if (newArr[j] > newArr[j + 1]) {

                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Array already sorted
            if (!swapped) {
                break;
            }
        }

        // Put sorted elements back into 2D array
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = newArr[k++];
            }
        }

        // Print sorted 2D array
        System.out.println("Sorted 2D Array is:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
            {10, 2, 3},
            {5, 9, 20},
            {10, 50, 30}
        };

        sort2DArray(arr);
    }
}
