class New {

    // Reverse an array without using another array
    static int[] reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        // Swap elements from both ends
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int new_arr[] = reverse(arr);

        // Print the reversed array
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
