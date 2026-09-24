// Finding pivot index
class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 3, 10, 8, 5, 20};

        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        // Fill the left sum array
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        // Fill the right sum array
        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i];
        }

        // Check pivot index
        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];
            if (left == right) {
                System.out.println("Pivot index is: " + i);
                return;
            }
        }

        // If no element found
        System.out.println("No pivot index");
    }
}
