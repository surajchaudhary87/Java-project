class Main {

    // Check whether an array is sorted in ascending order
    static boolean checkArraySorted(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = checkArraySorted(arr);

        if (result) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
