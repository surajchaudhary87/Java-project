class Main {

    // Find the unique elements
    static void uniqueElements(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean unique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 40, 20, 50};

        uniqueElements(arr);
    }
}
