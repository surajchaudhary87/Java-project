class Main {

    //Function to merge two arrays
    static void mergeArrays(int arr1[], int arr2[]){

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Create new array
        int result[] = new int[n1 + n2];

        // Copy first array
        for(int i = 0; i < n1; i++){
            result[i] = arr1[i];
        }
        // Copy second array
        for(int i = 0; i < n2; i++){
            result[n1 + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = {40, 50, 60};

        mergeArrays(arr1, arr2);
    }
}
