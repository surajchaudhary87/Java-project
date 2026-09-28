// Sum of Right diagonal 2D array
class Main {

    static void sumOfDiagonal(int arr[][], int row, int column){
        int sum = 0;

        if(row == column){

            for(int i = 0; i < row; i++){
                sum += arr[i][column -1 -i];
            }

            System.out.println("Sum of diagonal = " + sum);
        } 
        else {
            System.out.println("Sum of diagonal is not possible.");
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {10,20,30},
            {10,20,30}
        };

        sumOfDiagonal(arr, 3, 3);
    }
}
