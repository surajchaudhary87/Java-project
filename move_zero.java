public class Main {

    static void moveZero(int arr[]) {
        int index = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};

        moveZero(arr);
    }
}
