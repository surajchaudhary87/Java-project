class New {

    // Check whether an array is sorted in decending order
    static boolean checkArraySorted(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        boolean result = checkArraySorted(arr);

        if (result) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
