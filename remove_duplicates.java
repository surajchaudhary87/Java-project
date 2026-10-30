class Main {

    //Remove the duplicate elements in array
    public static void removeDuplicates(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;
            //Check previous elements
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            
            //Print only unique elements
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 50, 10, 60, 20};

        removeDuplicates(arr);
    }
}
