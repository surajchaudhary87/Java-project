// Finding the smallest element in an array.

class Main {
    public static void main(String[] args) {

        int arr[] = {10, 25, 7, 45, 18, 32};

        int n = arr.length;
        int smallest = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element is: " + smallest);
    }
}
